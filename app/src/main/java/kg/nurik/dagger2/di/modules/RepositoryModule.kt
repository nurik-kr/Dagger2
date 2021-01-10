package kg.nurik.dagger2.di.modules

import dagger.Module
import dagger.Provides
import kg.nurik.dagger2.data.*
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(service: RetrofitInteractor): RetrofitRepository {
        return RetrofitRepositoryImpl(service)
    }
}