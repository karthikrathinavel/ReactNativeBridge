package com.reactnativebridge;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class CustomModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    CustomModule(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void show(){
        Toast.makeText(reactContext, "Hi android", Toast.LENGTH_LONG).show();
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomModule";
    }
}
