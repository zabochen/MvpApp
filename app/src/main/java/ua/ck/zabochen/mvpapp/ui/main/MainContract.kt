package ua.ck.zabochen.mvpapp.ui.main

import ua.ck.zabochen.mvpapp.mvp.BaseMvpPresenter
import ua.ck.zabochen.mvpapp.mvp.BaseMvpView

interface MainContract {
    interface View : BaseMvpView
    interface Presenter : BaseMvpPresenter<MainContract.View>
}