package ua.ck.zabochen.mvpapp.ui.main

import android.os.Bundle
import ua.ck.zabochen.mvpapp.MainApp
import ua.ck.zabochen.mvpapp.R
import ua.ck.zabochen.mvpapp.mvp.MvpAppCompatActivity
import javax.inject.Inject

class MainActivity : MvpAppCompatActivity(), MainContract.View {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun init(savedInstanceState: Bundle?) {
        // Layout
        setContentView(R.layout.activity_main)

        // Inject presenter
        MainApp.appComponent().inject(this)

        // Attach view
        this.mainPresenter.attachView(this)
    }

    override fun onDestroy() {
        // Detach view
        this.mainPresenter.detachView()
        super.onDestroy()
    }
}
