package com.vansh.mvpkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.vansh.mvpkotlin.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainActivityView{

    var presenter : MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresentImpl(this)

        idBtnSubmit.setOnClickListener {

            if(idEtUserName.text.toString().isEmpty()){
               getString(R.string.enter_userName).toast(this)
                return@setOnClickListener
            }
            callApi(idEtUserName.text.toString())
        }

    }

    private fun callApi(userName : String){
            presenter?.submitUserInfo(userName)
    }

    override fun showLoading() {
        idCLPBLoading.visibility = View.VISIBLE
    }

    override fun hideLoading() {

        Handler().postDelayed({
            idCLPBLoading.visibility = View.GONE
        }, 2000)
    }

    override fun onDestroy() {
        presenter?.destroyClass()
        super.onDestroy()
    }

    override fun displayUserInfo(userName: String) {
        Handler().postDelayed({
            idEtDisplayUserName.visibility = View.VISIBLE
            idEtDisplayUserName.text = userName
        }, 2000)
    }
}
