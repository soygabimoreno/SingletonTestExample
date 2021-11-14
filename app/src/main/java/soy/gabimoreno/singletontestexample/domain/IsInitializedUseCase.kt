package soy.gabimoreno.singletontestexample.domain

class IsInitializedUseCase {

    operator fun invoke(): Boolean = if (Status.value == Status.Type.INITIALIZED) {
        Status.value = Status.Type.CHANGED
        true
    } else {
        Status.value = Status.Type.INITIALIZED
        false
    }
}
