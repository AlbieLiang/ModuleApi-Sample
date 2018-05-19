package cc.suitalk.moduleapi.sample.b.api;

import cc.suitalk.moduleapi.extension.annotation.ApiField;
import cc.suitalk.moduleapi.extension.annotation.ApiMethod;
import cc.suitalk.moduleapi.extension.annotation.MakeApi;
import cc.suitalk.moduleapi.sample.second.api.ModuleSecondModelApi;

/**
 * Created by albieliang on 2018/2/7.
 */

@MakeApi
public class ModuleBModel implements ModuleSecondModelApi, ModuleBModelApi {

    @ApiField
    public static final int STYLE_HOLO = 0;

    @ApiField
    public static final int STYLE_DARK = 1;

    @ApiField
    public static final int STYLE_RED = 2;

    @ApiMethod
    public void showToast(int style, String message) {
        // show Toast
    }
}