package com.hpdeveloper.kotlinsample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activityOnCreate(savedInstanceState)
    }

    abstract fun getLayout(): Int
    abstract fun activityOnCreate(savedInstanceState: Bundle?)
}
