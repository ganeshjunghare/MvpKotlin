package com.tratagroup.mvplib

import android.content.Context
import android.widget.Toast

class MainClass(val context: Context): MainActivityView {

    val presenter: MainActivityPresenter = MainActivityPresentImpl(this)

    fun callApi(userName : String) {
        presenter.submitUserInfo(userName)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun displayUserInfo(userName: String) {
        Toast.makeText(context, userName, Toast.LENGTH_SHORT).show()
    }
}