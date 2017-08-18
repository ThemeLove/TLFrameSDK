package com.themelove.framesdk.agent;

import android.app.Activity;

/**
 * TLFrameSDK对外唯一代理类，提供了SDK对外所有功能：
 * [初始化、登录、支付、设置debug模式、游戏行为统计、注销、切换账号、退出、悬浮框]
 * Created by qingshanliao on 2017/8/16.
 */
public class TLFrameSDK {
    private static TLFrameSDK instance;

    private TLFrameSDK() {
    }

    public TLFrameSDK getInstnce() {
        synchronized (TLFrameSDK.class) {
            if (instance == null) {
                instance = new TLFrameSDK();
            }
        }
        return instance;
    }

    public void init(Activity activity){

    }



}
