package com.vansh.mvpkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vansh.mvpkotlin.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idBtnSubmit.setOnClickListener {

            if(idEtUserName.text.toString().isEmpty()){
               getString(R.string.enter_userName).toast(this)
                return@setOnClickListener
            }

        }

    }
}
