package ua.ck.zabochen.mvpapp.mvp

interface BaseMvpPresenter<V : BaseMvpView> {
    var viewIsAttached: Boolean
    fun attachView(view: V)
    fun detachView()
}