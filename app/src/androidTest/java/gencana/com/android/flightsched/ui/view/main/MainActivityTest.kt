package gencana.com.android.flightsched.ui.view.main

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.runner.RunWith
import androidx.test.rule.ActivityTestRule
import com.schibsted.spain.barista.assertion.BaristaRecyclerViewAssertions.assertRecyclerViewItemCount
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn
import com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo
import com.schibsted.spain.barista.interaction.BaristaListInteractions.clickListItem
import com.schibsted.spain.barista.interaction.BaristaListInteractions.scrollListToPosition

import gencana.com.android.flightsched.R
import org.junit.Rule
import org.junit.Test


/**
 * Created by Gen Cana on 31/10/2018
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @get:Rule val mActivityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    private lateinit var mActivity: MainActivity

    @Before
    fun setActivity() {
        mActivity = mActivityRule.activity
    }

    @Test
    fun emptyPlaceholderDisplayedOnLaunch() {

        assertDisplayed(R.string.error_empty_initial)

        Thread.sleep(2000)
        writeTo(R.id.auto_search_from, "MNL")
        writeTo(R.id.auto_search_to, "BCN")
        clickOn(R.id.btn_search)

        assertRecyclerViewItemCount(R.id.recycler_view, 9)
        scrollListToPosition(R.id.recycler_view, 6)
        clickListItem(R.id.recycler_view, 4)
    }

}