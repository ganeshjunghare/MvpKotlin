package com.vansh.mvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmysoft.mvpmodule.MainClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idBtnSubmit.setOnClickListener {

            if(idEtUserName.text.toString().isEmpty()){
                return@setOnClickListener
            }
            MainClass(this).callApi(idEtUserName.text.toString())
        }

    }
}
