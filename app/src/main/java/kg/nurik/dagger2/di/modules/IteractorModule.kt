package kg.nurik.dagger2.di.modules

import dagger.Module
import dagger.Provides
import kg.nurik.dagger2.data.RetrofitApi
import kg.nurik.dagger2.data.RetrofitInteractor
import kg.nurik.dagger2.data.RetrofitInteractorImpl
import javax.inject.Singleton

@Module
class IteractorModule {
    @Provides
    @Singleton
    fun provideIteractor(service: RetrofitApi): RetrofitInteractor {
        return RetrofitInteractorImpl(service)
    }
}