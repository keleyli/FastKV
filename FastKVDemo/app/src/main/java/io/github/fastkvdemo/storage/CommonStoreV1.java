package io.github.fastkvdemo.storage;

import android.content.SharedPreferences;
import android.util.Log;

import io.github.fastkvdemo.application.GlobalConfig;
import io.github.fastkvdemo.fastkv.FastPreferences;

public class CommonStoreV1 {
    public static final String NAME = "common_store";
    // public static final SharedPreferences preferences = GlobalConfig.appContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    public static final SharedPreferences preferences = FastPreferences.adapt(GlobalConfig.appContext, NAME, false);

    static {
        preferences.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                Log.d("MyTag", "changed key:" + key);
            }
        });
    }

    public static final String LAUNCH_COUNT = "launch_count";
    public static final String DEVICE_ID = "device_id";
    public static final String INSTALL_ID = "install_id";

}
