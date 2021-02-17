package com.raccoon.lab1_guess
import java.util.*

class SecretNumber {
    var secretNum : Int = Random().nextInt(10)+1
    var count : Int = 0

    fun validate(number : Int) : Int{
        count=count+1
        return number - secretNum
    }
    fun right(){
      //  secretNum = Random().nextInt(10)+1
        count=0
    }
}

fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secretNum)

}