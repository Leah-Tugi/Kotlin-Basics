package com.example.kotlinbasics

fun main (){
    println("Enter your age as a whole number: ")
    val enteredAge = readln()
    var age  = 0
    age = enteredAge.toInt()

    if (age in 18..39) {
        print("You can enter the club")
    }
    else if (age >= 40) {
        println("You cannot go into the club, please go home.")
    }
    else {
        println("Age not verified. Please contact support.")
    }

}