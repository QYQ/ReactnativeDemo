package com.reactnativedemo.react.module;

import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by Kent on 2016/1/20.
 */
public class MyToastModule extends ReactContextBaseJavaModule{


    private static final String TOAST_DURATION_LONG = "LONG";
    private static final String TOAST_SURATION_SHORT = "SHORT";

    public MyToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public Map<String, Object> getConstants() {
        
        final Map<String, Object> constants = new HashMap<String, Object>();
        constants.put(TOAST_DURATION_LONG , Toast.LENGTH_LONG);
        constants.put(TOAST_SURATION_SHORT, Toast.LENGTH_SHORT);
        return constants;
    }

    @Override
    public String getName() {
        return "MyToast";
    }

    @ReactMethod
    public void show(String text, int duration, Callback callback){
        Toast.makeText(getReactApplicationContext(), text, duration).show();
        callback.invoke("回调函数");
    }
}
