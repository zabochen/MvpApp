package ua.ck.zabochen.mvpapp.di.component

import dagger.Component
import ua.ck.zabochen.mvpapp.di.module.MainModule
import ua.ck.zabochen.mvpapp.ui.main.MainActivity
import javax.inject.Singleton

@Component(modules = [MainModule::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}