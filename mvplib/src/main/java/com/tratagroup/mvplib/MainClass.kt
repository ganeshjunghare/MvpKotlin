package com.tratagroup.mvplib

class MainClass: MainActivityView {

    val presenter: MainActivityPresenter = MainActivityPresentImpl(this)

    fun callApi(userName : String) {
        presenter.submitUserInfo(userName)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun displayUserInfo(userName: String) {

    }
}