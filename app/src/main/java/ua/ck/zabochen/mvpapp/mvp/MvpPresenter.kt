package ua.ck.zabochen.mvpapp.mvp

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

open class MvpPresenter<V : BaseMvpView> : BaseMvpPresenter<V>, AnkoLogger {

    protected var view: V? = null
        private set

    override var viewIsAttached: Boolean = this.view != null

    override fun attachView(view: V) {
        this.view = view
        info { "Presenter: Attach view" }
    }

    override fun detachView() {
        this.view = null
        info { "Presenter: Detach view" }
    }
}