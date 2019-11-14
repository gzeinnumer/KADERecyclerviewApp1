package com.gzeinnumer.kaderecyclerviewapp1

import android.app.Activity
import android.view.View
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions

@ContainerOptions(cache = CacheImplementation.NO_CACHE)
class MyActivity : Activity(){
//    fun MyActivity.a(){
//        textView.text = "Hidden view"
//        textView.visibility = View.VISIBLE
//    }
//    fun Activity.b() {
//        textView.text = "Hidden view"
//        textView.visibility = View.INVISIBLE
//    }
}