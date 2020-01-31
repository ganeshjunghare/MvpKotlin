package com.tratagroup.mvplib

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter

/**
 * Created by Ganesh Junghare on 9/27/2019.
 */
class MainActivityPresentImpl(var view: MainActivityView?):
    MvpBasePresenter<MainActivityView>(),
    MainActivityPresenter,
    MainActivityInteractor.OnQueryFetchUserIntoListner{

    var interactor : com.tratagroup.mvplib.MainActivityInteractor =
        com.tratagroup.mvplib.MainActivityInteractorImpl()

    override fun submitUserInfo(userName: String) {
        if(view != null){
            view?.showLoading()
            interactor.insertUserInfo(userName, this)
        }
    }
    override fun onSuccessFetchUserInfo(userName: String) {
        if(view != null) {
            view?.hideLoading()
            view?.displayUserInfo(userName)
        }
    }

    override fun destroyClass() {
        view = null
    }
}