package org.bcschain.wallet;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;

import com.crashlytics.android.Crashlytics;

import org.bcschain.wallet.datastorage.QStoreStorage;
import org.bcschain.wallet.datastorage.BCSSettingSharedPreference;
import org.bcschain.wallet.utils.FontManager;
import org.bcschain.wallet.utils.migration_manager.MigrationManager;

import io.fabric.sdk.android.Fabric;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BCSApplication extends MultiDexApplication{

    public static BCSApplication instance;
    public static final String REALM_NAME = "org.bcschain.realm";
    private Realm realm;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        if (!BuildConfig.DEBUG) {
            Fabric.with(this, new Crashlytics());
        }
        FontManager.init(getAssets());
        QStoreStorage.getInstance(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .name(REALM_NAME)
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(config);
        realm = Realm.getDefaultInstance();
        try {
            int currentVersion = getCodeVersion();
            BCSSettingSharedPreference bcsSettingSharedPreference = BCSSettingSharedPreference.getInstance();
            int migrationVersion = bcsSettingSharedPreference.getCodeVersion(getApplicationContext());
            if (currentVersion > migrationVersion) {
                MigrationManager migrationManager = new MigrationManager();
                int newMigrationVersion = migrationManager.makeMigration(currentVersion, migrationVersion, getApplicationContext(), realm);
                bcsSettingSharedPreference.setMigrationCodeVersionString(getApplicationContext(), newMigrationVersion);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int getCodeVersion() throws PackageManager.NameNotFoundException {
        PackageInfo pInfo = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0);
        return pInfo.versionCode;
    }

    public Realm getRealm() {
        return realm;
    }
}