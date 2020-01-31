package com.tratagroup.mvplib

/**
 * Created by Ganesh Junghare on 9/27/2019.
 */
class MainActivityInteractorImpl: com.tratagroup.mvplib.MainActivityInteractor {
    override fun insertUserInfo(
        userName: String,
        onQueryFetchUserIntoListner: com.tratagroup.mvplib.MainActivityInteractor.OnQueryFetchUserIntoListner
    ) {
        onQueryFetchUserIntoListner.onSuccessFetchUserInfo(userName)
    }
}