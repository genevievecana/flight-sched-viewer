package gencana.com.android.domain.interactor

import gencana.com.android.domain.BaseTestClass
import gencana.com.android.domain.model.*
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import io.reactivex.observers.TestObserver
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import java.security.InvalidParameterException

/**
 * Created by Gen Cana on 20/10/2018
 */
@RunWith(MockitoJUnitRunner::class)
class GetFlightSchedulesInteractorTest: BaseTestClass() {

    @Mock
    private lateinit var flightRepository: FlightRepository

    private var params = FlightScheduleParams("abc", "bcd", "c")

    @Mock
    private lateinit var scheduleResource: ScheduleResponse

    private lateinit var flightInteractor: GetFlightSchedulesInteractor

    private val testObserver by lazy {
        TestObserver<ScheduleResponse>()
    }

    override fun setup() {
        flightInteractor = GetFlightSchedulesInteractor(flightRepository)
    }


    @Test
    fun `test valid usecase`() {
        Mockito.`when`(flightRepository.getFlightSchedules(params.origin!!, params.destination!!, params.fromDateTime!!))
                .thenReturn(Single.just(scheduleResource))

        flightInteractor.getObservable(params)
                .subscribe(testObserver)

        assertBuilder.that(testObserver.assertValue{
            it == scheduleResource
        })

        assertBuilder.that(testObserver.assertComplete())

        Mockito.verify(flightRepository)
                .getFlightSchedules(params.origin!!, params.destination!!, params.fromDateTime!!)
        Mockito.verifyNoMoreInteractions(flightRepository)
    }

    @Test
    fun `test throw invalidparameter`() {
        params.fromDateTime = null
        flightInteractor.getObservable(params).subscribe(testObserver)
        assertBuilder.that(testObserver.assertError(InvalidParameterException::class.java))
    }

    @Test
    fun `test valid params`() {
        var isValid =  flightInteractor.validateParams(params)
        assertBuilder.that(isValid).isTrue()
    }

    @Test
    fun `test invalid params`() {
        params.origin = null
        assertBuilder.that(flightInteractor.validateParams(params)).isFalse()

        params.origin = "abc"
        assertBuilder.that(flightInteractor.validateParams(params)).isTrue()

        params.destination = null
        assertBuilder.that(flightInteractor.validateParams(params)).isFalse()

        params.destination = "abc"
        assertBuilder.that(flightInteractor.validateParams(params)).isTrue()

        params.fromDateTime = null
        assertBuilder.that(flightInteractor.validateParams(params)).isFalse()
    }

}