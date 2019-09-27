package com.vansh.mvpkotlin

import com.hannesdorfmann.mosby.mvp.MvpView

/**
 * Created by Ganesh Junghare on 9/27/2019.
 */
interface MainActivityView : MvpView{

    fun showLoading()
    fun hideLoading()
    fun displayUserInfo(userName : String)

}