package com.ziv.video.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;



/**
 * 工具类
 */
public class Utils {

    /**
     * 字符串为空返回""
     */
    public static String isEmpty(String str){
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /**
     * 防止控件多次点击
     * @return
     */
    static long lastClickTime = 0;
    public static boolean isAgainClick(){
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if(0< timeD && timeD < 3000){
            return true;
        }
        lastClickTime = time;
        return false;
    }

    /**
     * 打印日志
     * @param s
     */
    public static void showLog(String s){
        Log.e("agt",s);
    }
    public static void showLog(String tag , String s){
        Log.e(tag,s);
    }


    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     * @param context
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 吐丝
     * @param context
     * @param s
     */
    public static void showToast(Context context, String s){
        Toast.makeText(context,s, Toast.LENGTH_SHORT).show();
    }

    /**
     * 判断是否大于23
     * @return
     */
    public static boolean isVersionGreater23(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            return true;
        else
            return false;
    }

    /**
     * 验证手机号格式
     * @param str
     * @return
     */
    public static boolean isPhoneNumber(String str){
        if (TextUtils.isEmpty(str))
            return false;
        String telRegex = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
        return str.matches(telRegex);
    }

}
