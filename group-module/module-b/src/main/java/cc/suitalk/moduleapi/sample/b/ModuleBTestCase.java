package cc.suitalk.moduleapi.sample.b;

import android.util.Log;

import cc.suitalk.moduleapi.ModuleApi;
import cc.suitalk.moduleapi.sample.first.api.ModuleFirstStorageApi;
import cc.suitalk.moduleapi.sample.second.api.ModuleSecondModelApi;

/**
 * Created by albieliang on 2018/2/7.
 */

public class ModuleBTestCase {

    private static final String TAG = "ModuleBTestCase";

    public void testModuleFirst() {
        ModuleApi.get(ModuleFirstStorageApi.class).set("key", "albieliang");
        Object value = ModuleApi.get(ModuleFirstStorageApi.class).get("key");
        Log.i(TAG, "value : " + value);
    }

    public void testModuleSecond() {
        ModuleApi.get(ModuleSecondModelApi.class).showToast(ModuleSecondModelApi.STYLE_DARK, "Test from ModuleSecond.");
    }
}
