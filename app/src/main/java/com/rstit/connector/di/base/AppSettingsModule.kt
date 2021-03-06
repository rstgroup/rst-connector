package com.rstit.connector.di.base

import android.content.Context
import com.rstit.connector.di.base.scope.ActivityScope
import com.rstit.connector.settings.AppSettings
import com.rstit.connector.settings.AppSettingsImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Tomasz Trybala
 * @since 2017-07-18
 */
@Module
@ActivityScope
class AppSettingsModule {
    @Provides
    @Singleton
    fun provideAppSettings(context: Context): AppSettings = AppSettingsImpl(context)
}