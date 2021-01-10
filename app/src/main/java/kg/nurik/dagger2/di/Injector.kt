package kg.nurik.dagger2.di

import kg.nurik.dagger2.Dagger2App
import kg.nurik.dagger2.data.RetrofitInteractor
import kg.nurik.dagger2.data.RetrofitRepository
import kg.nurik.dagger2.data.remote.PrefsHelper
import javax.inject.Inject

inline fun <T> inject(crossinline block: Injector.() -> T): Lazy<T> = lazy { Injector().block() }

class Injector {
    @Inject
    lateinit var retrofitIteractor: RetrofitInteractor

    @Inject
    lateinit var retrofitRepository: RetrofitRepository

    @Inject
    lateinit var preference: PrefsHelper

    init {
        Dagger2App.App.mainComponent.inject(this)
    }
}