package soy.gabimoreno.singletontestexample.domain

import org.junit.Assert.assertTrue
import org.junit.Test

internal class IsInitializedUseCaseWrongTest {

    val useCase = IsInitializedUseCase()

    @Test
    fun `WHEN useCase is invoked THEN return true 1`() {
        val result = useCase()

        assertTrue(result)
    }

    @Test
    fun `WHEN useCase is invoked THEN return true 2`() {
        val result = useCase()

        // This fails because the status has changed in the use case
        // and it has not been initialized in the tearDown
        assertTrue(result)
    }
}
