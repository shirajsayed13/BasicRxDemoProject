package com.shirajsayed.basicrxdemoproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rxJavaBasicButton.setOnClickListener {
            RxJavaBasicDialogFragment
                .newInstance()
                .show(supportFragmentManager, "Basic")
        }

        rxKotlinBasicButton.setOnClickListener {
            RxKotlinBasicDialogFragment
                .newInstance()
                .show(supportFragmentManager, "RxKotlinBasic")
        }
    }
}
