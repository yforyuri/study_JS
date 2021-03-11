package com.example.practice

import java.util.*

fun main(args: Array<String>){
    val lottery = Lottery()
    for (i in 0..6){
        lottery.num()
    }
}

class Lottery{
    fun num(){
        val random = Random()
        print(random.nextInt(45) + 1)
        print(",")
    }
}