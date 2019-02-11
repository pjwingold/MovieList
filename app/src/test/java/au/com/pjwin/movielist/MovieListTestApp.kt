package au.com.pjwin.movielist

import au.com.pjwin.commonlib.Common
import au.com.pjwin.movielist.util.TestConfig

class MovieListTestApp : MovieListApp() {

    override fun initCommon() {
        Common.init(applicationContext, TestConfig(), true)
    }
}