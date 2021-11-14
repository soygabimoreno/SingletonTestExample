package soy.gabimoreno.singletontestexample.domain

import org.junit.After
import org.junit.Assert.assertTrue
import org.junit.Test

internal class IsInitializedUseCaseRightTest {

    val useCase = IsInitializedUseCase()

    @After
    fun tearDown() {
        Status.initValue()
    }

    @Test
    fun `WHEN useCase is invoked THEN return true 1`() {
        val result = useCase()

        assertTrue(result)
    }

    @Test
    fun `WHEN useCase is invoked THEN return true 2`() {
        val result = useCase()

        // This works because of the status has been initialized in the tearDown
        assertTrue(result)
    }
}
