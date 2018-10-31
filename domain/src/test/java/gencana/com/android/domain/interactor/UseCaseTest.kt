package gencana.com.android.domain.interactor

import gencana.com.android.domain.BaseTestClass
import gencana.com.android.domain.model.Params
import io.reactivex.Single
import io.reactivex.observers.TestObserver
import org.junit.Test
import java.security.InvalidParameterException

/**
 * Created by Gen Cana on 20/10/2018
 */

class UseCaseTest: BaseTestClass(){

    private lateinit var useCase: UseCaseClass

    override
    fun setup(){
        useCase = UseCaseClass()
    }

    @Test
    fun `test valid usecase`() {
        val testObserver = TestObserver<String>()
        useCase.getObservable("BCN")
                .subscribe(testObserver)

        assertBuilder.that(testObserver.assertResult(TEST_STRING))
    }

    @Test
    fun `test invalid usecase`() {
        val testObserver = TestObserver<String>()
        useCase.getObservable(null).subscribe(testObserver)
        assertBuilder.that(testObserver.assertError(InvalidParameterException::class.java))
    }

    @Test
    fun `test valid params`() {
        val isValid = useCase.validateParams("name")
        assertBuilder.that(isValid).isTrue()
    }

    @Test
    fun `test invalid params`() {
        var isValid = useCase.validateParams("")
        assertBuilder.that(isValid).isFalse()

        isValid = useCase.validateParams(null)
        assertBuilder.that(isValid).isFalse()
    }

    private class UseCaseClass
        : UseCase<String, String?>(){
        override fun validateParams(params: String?): Boolean {
            return !params.isNullOrEmpty()
        }

        override fun registerObservable(params: String?): Single<String> {
            return Single.just(TEST_STRING)
        }
    }


}