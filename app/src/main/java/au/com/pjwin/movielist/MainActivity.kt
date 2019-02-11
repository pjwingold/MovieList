package au.com.pjwin.movielist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.MenuItem
import au.com.pjwin.commonlib.ui.ViewActivity
import au.com.pjwin.movielist.ui.MovieDetailFragment
import au.com.pjwin.movielist.ui.MovieFragment

class MainActivity : ViewActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            showFragment(MovieFragment())
        }
    }

    override fun onPrimaryAction(fragment: Fragment) {
        when (fragment) {
            is MovieFragment -> {
                fragment.selectedMovie?.let { showFragment(MovieDetailFragment.newInstance(it)) }
            }

            else -> super.onPrimaryAction(fragment)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
