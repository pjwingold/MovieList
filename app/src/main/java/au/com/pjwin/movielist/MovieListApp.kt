package au.com.pjwin.movielist

import android.app.Application
import au.com.pjwin.commonlib.Common
import au.com.pjwin.movielist.util.AppConfig

open class MovieListApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initCommon()
    }

    protected open fun initCommon() {
        Common.init(applicationContext, AppConfig())
    }
}