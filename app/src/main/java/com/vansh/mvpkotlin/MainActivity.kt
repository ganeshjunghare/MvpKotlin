package com.vansh.mvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
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
