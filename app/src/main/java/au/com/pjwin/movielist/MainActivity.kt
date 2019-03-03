package au.com.pjwin.movielist

import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import au.com.pjwin.commonlib.ui.ViewActivity

class MainActivity : ViewActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            val hostFragment = getExistingFragment<NavHostFragment>(R.id.nav_host_fragment)
                    ?: return

            val naviController = hostFragment.navController

            appBarConfiguration = AppBarConfiguration(naviController.graph)

            setupActionBarWithNavController(naviController, appBarConfiguration)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp(appBarConfiguration)
    }
}
