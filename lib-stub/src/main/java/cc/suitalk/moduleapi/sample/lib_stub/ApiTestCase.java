package cc.suitalk.moduleapi.sample.lib_stub;

import cc.suitalk.moduleapi.ModuleApi;
import cc.suitalk.moduleapi.sample.api.PlayerManagerApi;

/**
 * Created by albieliang on 2018/2/6.
 */

public class ApiTestCase {

    public static void testing() {
        ModuleApi.get(PlayerManagerApi.class).play("http://abc.com/music.mp4");
    }
}
