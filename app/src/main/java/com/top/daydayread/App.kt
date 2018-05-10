package com.top.daydayread

import android.app.Application
import android.provider.Settings
import com.tencent.bugly.Bugly
import com.tencent.bugly.crashreport.CrashReport
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.ctx

/**
 * 作者：李阳
 * 时间：2018/5/9
 * 描述：
 */
class App: Application(),AnkoLogger {

    var BuglyID="e9a3a42baf"

    override fun onCreate() {
        super.onCreate()
        initBugly()

    }

    private fun initBugly(){
        Bugly.init(this,BuglyID,false) // 第三个参数为SDK调试模式开关，
    }
}