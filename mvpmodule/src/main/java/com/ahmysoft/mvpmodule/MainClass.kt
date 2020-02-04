package com.ahmysoft.mvpmodule

import android.content.Context
import android.widget.Toast
import com.vansh.mvpkotlin.MainActivityPresentImpl
import com.vansh.mvpkotlin.MainActivityPresenter
import com.vansh.mvpkotlin.MainActivityView

class MainClass(val context: Context): MainActivityView {
    var presenter : MainActivityPresenter? = MainActivityPresentImpl(this)

    fun callApi(userName : String){
        presenter?.submitUserInfo(userName)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {


    }

    override fun displayUserInfo(userName: String) {
        Toast.makeText(context, userName, Toast.LENGTH_SHORT).show()
    }
}