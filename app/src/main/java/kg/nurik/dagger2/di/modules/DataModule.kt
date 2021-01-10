package kg.nurik.dagger2.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import kg.nurik.dagger2.data.remote.PrefsHelper
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideSharedPreference(context: Context): PrefsHelper {
        return PrefsHelper(context)
    }
}