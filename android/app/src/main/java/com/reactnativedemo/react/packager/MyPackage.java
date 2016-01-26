package com.reactnativedemo.react.packager;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativedemo.react.module.MyToastModule;
import com.reactnativedemo.react.view.MyTextViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kent on 2016/1/20.
 */
public class MyPackage  implements ReactPackage{

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        ArrayList<NativeModule> modules = new ArrayList<>();
        modules.add(new MyToastModule(reactContext));
        return modules;

//        return Arrays.asList(new NativeModule[]{
//                // Modules from third-party
//                new MyToastModule(reactContext),
//        });
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        ArrayList<ViewManager> modules = new ArrayList<>();
        modules.add(new MyTextViewManager());
        return modules;
    }
}
