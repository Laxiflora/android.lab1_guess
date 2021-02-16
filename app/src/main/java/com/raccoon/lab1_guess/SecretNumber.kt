package com.raccoon.lab1_guess
import java.util.*

class SecretNumber {
    val secret : Int = Random().nextInt(10)+1
    val count : Int = 0

    fun validate(number : Int) : Int{
        return number - secret
    }
}

fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secret)

}