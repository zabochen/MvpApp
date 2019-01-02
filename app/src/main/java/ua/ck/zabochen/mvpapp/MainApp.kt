package ua.ck.zabochen.mvpapp

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import ua.ck.zabochen.mvpapp.di.component.AppComponent
import ua.ck.zabochen.mvpapp.di.component.DaggerAppComponent
import ua.ck.zabochen.mvpapp.di.module.MainModule

class MainApp : Application(), AnkoLogger {

    companion object {
        private lateinit var appComponent: AppComponent
        fun appComponent(): AppComponent = appComponent
    }

    override fun onCreate() {
        super.onCreate()
        setDagger()
    }

    private fun setDagger() {
        appComponent = DaggerAppComponent.builder()
            .mainModule(MainModule())
            .build()
        info { "MainApp: Set dagger" }
    }
}