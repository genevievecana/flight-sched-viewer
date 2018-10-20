package gencana.com.android.domain

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.StandardSubjectBuilder
import com.google.common.truth.Truth
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.rules.ExpectedException

/**
 * Created by Gen Cana on 20/10/2018
 */

abstract class BaseTestClass {

    val assertBuilder: StandardSubjectBuilder by lazy {
        Truth.assert_()
    }

    @get:Rule
    val expectedException: ExpectedException by lazy {
        ExpectedException.none()
    }

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    companion object {
        const val TEST_STRING = "Test Observable"

        @BeforeClass
        @JvmStatic
        fun setUpClass() {
            RxAndroidPlugins.setInitMainThreadSchedulerHandler { _ -> TestScheduler() }
        }
    }

    @Before
    fun init(){
        setup()
    }

    abstract fun setup()
}