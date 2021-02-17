package com.raccoon.lab1_guess
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {   //同C++,繼承AppCompatActivity
    val secret = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {  //複寫父類別的function
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //R=package name, get res/layout/activity_main
        Log.d("MainActivity","偷偷作弊:答案是"+secret.secretNum)
        //R.id.hello    給定layout中的id，會回傳一個屬於他的ID(int)
        //R.drawable.xxx 抓取res/drawable/xxx
    }

    fun check(view : View){
        val playerInput = inputNumber.text.toString().toInt()
       // println("number : $playerInput")
        Log.d("MainActivity","number: "+playerInput)  //d = debug, debug訊息在上架的時候會自動被隱藏
        if(secret.validate(playerInput)==0){
        //    Toast.makeText(this,"恭喜答對",Toast.LENGTH_LONG).show()
            AlertDialog.Builder(this)
                    .setTitle("結果")
                    .setMessage("恭喜答對")
                    .setPositiveButton("OK",null)
                    .show()
            secret.right()
        }
        else{
            AlertDialog.Builder(this)
                    .setTitle("結果")
                    .setMessage("答錯囉，你已經猜了${secret.count}次")
                    .setPositiveButton("OK",null)
                    .show()
        //    Toast.makeText(this,"答錯囉，你已經猜了${secret.count}次",Toast.LENGTH_LONG).show()
        }
    }

}