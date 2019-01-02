package ua.ck.zabochen.mvpapp.di.module

import dagger.Module
import dagger.Provides
import ua.ck.zabochen.mvpapp.ui.main.MainPresenter
import javax.inject.Singleton

@Module
class MainModule {
    @Provides
    @Singleton
    fun providesPresenter() = MainPresenter()
}