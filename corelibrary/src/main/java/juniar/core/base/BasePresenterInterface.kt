package stechoq.jit.base

interface BasePresenterInterface<T> {
    fun init(view: T)
    fun destroy()
}