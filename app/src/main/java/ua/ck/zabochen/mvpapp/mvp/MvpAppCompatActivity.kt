package ua.ck.zabochen.mvpapp.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class MvpAppCompatActivity : AppCompatActivity(), BaseMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init(savedInstanceState)
    }

    protected abstract fun init(savedInstanceState: Bundle?)

    override fun getContext() = this
}