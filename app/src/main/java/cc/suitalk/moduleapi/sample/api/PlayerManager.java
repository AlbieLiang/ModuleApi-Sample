package cc.suitalk.moduleapi.sample.api;

import cc.suitalk.moduleapi.extension.annotation.ApiField;
import cc.suitalk.moduleapi.extension.annotation.ApiMethod;
import cc.suitalk.moduleapi.extension.annotation.MakeApi;

/**
 * Created by albieliang on 2018/2/4.
 */

@MakeApi
public class PlayerManager implements PlayerManagerApi {

    private static final String TAG = "ModuleApi.PlayerManager";

    @ApiField
    public static String Message = "testing";

    @ApiField
    public static final int Code = 1024;

    @ApiMethod
    public int play(String path) {
        return 0;
    }

    @ApiMethod
    public boolean pause(String path) {
        return true;
    }

    @ApiMethod
    public boolean stop(String path) {
        return true;
    }

    public void initialize() {
        // do nothing
    }
}