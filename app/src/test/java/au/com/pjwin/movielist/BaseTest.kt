package au.com.pjwin.movielist

import android.support.annotation.CallSuper
import io.mockk.MockKAnnotations
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AppTestRunner::class)
@Config(application = MovieListTestApp::class)
open class BaseTest {

    @CallSuper
    @Before
    open fun setup() {
        MockKAnnotations.init(this)
    }
}