package com.themelove.framesdk.config;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by qingshanliao on 2017/8/16.
 */

public class TLConfig {

    /**Application集合*/
    private List<String> mApplicationList;
    /**Param配置*/
    private HashMap<String,String> mParamsMap;
    /**plugin配置*/
    private SparseArray<String>    mPluginMap;

    private static TLConfig instance;
    private TLConfig(){
        mApplicationList=new ArrayList<>();
        mParamsMap=new HashMap<>();
        mPluginMap=new SparseArray<>();
    }

    public static TLConfig getInstance(){
        if (instance==null){
            synchronized (TLConfig.class){
                if (instance==null){
                    instance=new TLConfig();
                }
            }
        }
        return instance;
    }


    public void loadConfigFromAssets(){

    }
}
