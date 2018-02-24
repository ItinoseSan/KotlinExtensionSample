package com.example.itnav.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testCallJavaObject = Hoge()
        testCallJavaObject.foo()
        rootLayout.setOnClickListener {
            count++
            val sheepText = "You tapped view $count "
            textview.text = sheepText
        }
    }
}
