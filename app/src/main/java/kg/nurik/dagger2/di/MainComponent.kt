package kg.nurik.dagger2.di

import com.google.gson.annotations.Since
import dagger.Component
import kg.nurik.dagger2.di.modules.*
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DataModule::class,NetworkModule::class, IteractorModule::class, RepositoryModule::class])
interface MainComponent {

    fun inject(injector: Injector) {

    }
}