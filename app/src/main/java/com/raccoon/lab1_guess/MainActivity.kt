package com.raccoon.lab1_guess
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {   //同C++,繼承AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {  //複寫父類別的function
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //R=package name, get res/layout/activity_main
        //R.id.hello    給定layout中的id，會回傳一個屬於他的ID(int)
        //R.drawable.xxx 抓取res/drawable/xxx
    }

    fun check(view : View){
        val playerInput = inputNumber.text.toString().toInt()
       // println("number : $playerInput")
        Log.d("MainActivity","number: "+playerInput)  //d = debug, debug訊息在上架的時候會自動被隱藏
    }

}