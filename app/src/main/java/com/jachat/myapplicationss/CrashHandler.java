package com.jachat.myapplicationss;

import android.content.Context;
import android.util.Log;

public class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final String TAG = "CrashHandler";
    private static CrashHandler INSTANCE = new CrashHandler();
    private Context mContext;
    private Thread.UncaughtExceptionHandler mDefaultHandler;

    private CrashHandler() {
    }

    public static CrashHandler getInstance() {
        return INSTANCE;
    }

    public void init(Context ctx) {
        mContext = ctx;
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        long threadId = thread.getId();
        String message = ex.getMessage();
        String localizedMessage = ex.getLocalizedMessage();
        Log.e("KqwException", "------------------------------------------------------");
        Log.e("KqwException", "threadId = " + threadId);
        Log.e("KqwException", "message = " + message);
        Log.e("KqwException", "localizedMessage = " + localizedMessage);
        Log.e("KqwException", "------------------------------------------------------");
        ex.printStackTrace();
        Log.e("KqwException", "------------------------------------------------------");

//        // TODO 下面捕获到异常以后要做的事情，可以重启应用，获取手机信息上传到服务器等
//        Log.i("KqwException", "------------------应用被重启----------------");
//        // 重启应用
//        mContext.startActivity(mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName()));
//        //干掉当前的程序
//        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
