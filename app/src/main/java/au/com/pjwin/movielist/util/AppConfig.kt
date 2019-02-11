package au.com.pjwin.movielist.util


import au.com.pjwin.commonlib.Common
import au.com.pjwin.movielist.BuildConfig

class AppConfig : Common.Config {
    override fun readTimeout() = BuildConfig.READ_TIMEOUT

    override fun connectionTimeout() = BuildConfig.CONNECTION_TIMEOUT

    override fun debug() = BuildConfig.DEBUG
}