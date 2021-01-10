package kg.nurik.dagger2

import android.app.Application
import kg.nurik.dagger2.di.DaggerMainComponent
import kg.nurik.dagger2.di.MainComponent
import kg.nurik.dagger2.di.modules.AppModule

class Dagger2App : Application() {

    lateinit var mainComponent: MainComponent

    override fun onCreate() {
        super.onCreate()
        App = this
        mainComponent = DaggerMainComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    companion object {
        lateinit var App: Dagger2App
    }
}