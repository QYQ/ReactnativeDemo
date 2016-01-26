package com.reactnativedemo.react.view;

import android.graphics.Color;

import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by kent on 2016/1/21.
 */
public class MyTextViewManager  extends SimpleViewManager<MyReactTextView> {

    private static final String COMPONENT_NAME = "MyTextView";

    @Override
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override
    protected MyReactTextView createViewInstance(ThemedReactContext reactContext) {
        return new MyReactTextView(reactContext);
    }

    @ReactProp(name = "text")
    public void setText(MyReactTextView view, String src){
        view.setTextColor(Color.BLACK);
        view.setText(src);
    }
}
