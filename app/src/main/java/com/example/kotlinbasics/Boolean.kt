package com.example.kotlinbasics

fun main () {
    val myTrue: Boolean = true
    val myFalse: Boolean = false


    println(myTrue || myFalse) // This will be true

    println(myTrue && myFalse) // This will be false

    println(!myTrue) // This will be false


    // characters
    val myChar = 'a'
    val specialChar = '\u00AE' // check them from universal unicode characters

    println(myChar)
    println(specialChar)

    //strings -- collection of characters. They are objects (allow us to run functions of them)

    var name = "Leah"
    println(name.lowercase())

    var secondName = "Mumbi"
    println(name + " " + secondName)

    // if statements --- uses comparison operators
    var age = 24

    if (age >= 18){
        println("You can join the club")

    }
    else {
        println("You are too young to join the club!")

    }

    // user input using readln
    var myAge = 0
    // read what user enters in console
    println("Please enter your age as a whole number")
    val enteredValue = readln()
    myAge = enteredValue.toInt()  // parses string to int

    if (myAge >= 40){
        println("You cannot join the club")

    }
    else if (myAge >= 18) {
        println("You can join the club")
    }
    else {
        println("You are too young to join the club!")

    }
}