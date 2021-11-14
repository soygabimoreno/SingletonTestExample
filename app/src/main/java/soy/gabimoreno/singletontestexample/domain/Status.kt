package soy.gabimoreno.singletontestexample.domain

object Status {

    lateinit var value: Type

    init {
        initValue()
    }

    fun initValue() {
        value = Type.INITIALIZED
    }

    enum class Type {
        INITIALIZED,
        CHANGED
    }
}
