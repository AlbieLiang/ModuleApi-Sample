package cc.suitalk.moduleapi.sample.a;

import cc.suitalk.moduleapi.ModuleApi;
import cc.suitalk.moduleapi.sample.api.PlayerManagerApi;
import cc.suitalk.moduleapi.sample.b.api.ModuleBModelApi;

/**
 * Created by albieliang on 2018/2/7.
 */

public class ModuleATestCase {

    public void showModuleBToast() {
        ModuleApi.get(ModuleBModelApi.class).showToast(ModuleBModelApi.STYLE_RED, "Test from ModuleFirst.");
    }

    public void testAppApi() {
        ModuleApi.get(PlayerManagerApi.class).play("file:///data/data/cc.suitalk.moduleapi.sample/music.mp4");
    }
}
