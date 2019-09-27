package com.vansh.mvpkotlin

/**
 * Created by Ganesh Junghare on 9/27/2019.
 */
class MainActivityInteractorImpl: MainActivityInteractor {
    override fun insertUserInfo(
        userName: String,
        onQueryFetchUserIntoListner: MainActivityInteractor.OnQueryFetchUserIntoListner
    ) {
        onQueryFetchUserIntoListner.onSuccessFetchUserInfo(userName)
    }
}