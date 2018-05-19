package cc.suitalk.moduleapi.sample.first.api;

import java.util.HashMap;
import java.util.Map;

import cc.suitalk.moduleapi.extension.annotation.ApiMethod;
import cc.suitalk.moduleapi.extension.annotation.MakeApi;

/**
 * Created by albieliang on 2018/2/7.
 */

@MakeApi
public class ModuleFirstStorage implements ModuleFirstStorageApi {

    private Map<String, Object> mMap = new HashMap<>();

    @ApiMethod
    public Object get(String key) {
        return mMap.get(key);
    }

    @ApiMethod
    public void set(String key, Object value) {
        mMap.put(key, value);
    }
}