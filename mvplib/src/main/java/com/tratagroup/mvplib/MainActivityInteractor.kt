package com.tratagroup.mvplib

/**
 * Created by Ganesh Junghare on 9/27/2019.
 */
interface MainActivityInteractor {

    interface  OnQueryFetchUserIntoListner {
           fun onSuccessFetchUserInfo(userName : String)
    }

    fun insertUserInfo(userName : String, onQueryFetchUserIntoListner : OnQueryFetchUserIntoListner)
}
