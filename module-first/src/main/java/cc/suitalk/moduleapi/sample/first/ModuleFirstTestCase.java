package cc.suitalk.moduleapi.sample.first;

import cc.suitalk.moduleapi.ModuleApi;
import cc.suitalk.moduleapi.sample.api.PlayerManagerApi;
import cc.suitalk.moduleapi.sample.second.api.ModuleSecondModelApi;

/**
 * Created by albieliang on 2018/2/7.
 */

public class ModuleFirstTestCase {

    public void showModuleSecondToast() {
        ModuleApi.get(ModuleSecondModelApi.class).showToast(ModuleSecondModelApi.STYLE_RED, "Test from ModuleFirst.");
    }

    public void testAppApi() {
        ModuleApi.get(PlayerManagerApi.class).play("file:///data/data/cc.suitalk.moduleapi.sample/music.mp4");
    }
}
