package cc.suitalk.moduleapi.sample;

import android.app.Application;

import cc.suitalk.moduleapi.ModuleApi;
import cc.suitalk.moduleapi.sample.api.PlayerManager;
import cc.suitalk.moduleapi.sample.api.PlayerManagerApi;
import cc.suitalk.moduleapi.sample.first.api.ModuleFirstStorage;
import cc.suitalk.moduleapi.sample.first.api.ModuleFirstStorageApi;
import cc.suitalk.moduleapi.sample.second.api.ModuleSecondModel;
import cc.suitalk.moduleapi.sample.second.api.ModuleSecondModelApi;

/**
 * Created by albieliang on 2018/2/7.
 */

public class ModuleApiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize api, todo: auto generate code
        ModuleApi.set(ModuleFirstStorageApi.class, new ModuleFirstStorage());
        ModuleApi.set(ModuleSecondModelApi.class, new ModuleSecondModel());
        ModuleApi.set(PlayerManagerApi.class, new PlayerManager());
    }
}
