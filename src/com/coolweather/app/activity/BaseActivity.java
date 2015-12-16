package com.coolweather.app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**   
 * 设置activity的基础类   
 * 变量可以在这里设置 (所有活动都可以继承) 
 */      
public class BaseActivity extends Activity {  
      
    public static final String TAG="tag";  
      
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
    }  
      
    /** 
     *用于所有活动测试  
     */  
    public void toast(String msg){  
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();      
        Log.d(TAG, msg);  
    }  
} 
