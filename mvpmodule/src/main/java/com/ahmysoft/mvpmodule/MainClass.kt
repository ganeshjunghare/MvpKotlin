package com.ahmysoft.mvpmodule

import com.vansh.mvpkotlin.MainActivityPresentImpl
import com.vansh.mvpkotlin.MainActivityPresenter
import com.vansh.mvpkotlin.MainActivityView

class MainClass: MainActivityView {
    var presenter : MainActivityPresenter? = MainActivityPresentImpl(this)

    fun callApi(userName : String){
        presenter?.submitUserInfo(userName)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {


    }

    override fun displayUserInfo(userName: String) {

    }
}