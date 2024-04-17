package com.example.rockpaperscissors

fun main (){

    var computerChoice = " "
    var playerChoice = " "

    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    // generate a randomNumber
    val randomNUmber = (1 .. 3).random()

    // if statement that checks if random number is 1, 2 or 3 for Rock, Paper, Scissors respectively

    when (randomNUmber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    // store who is the winner

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie") {
        println("It's a tie")
    } else {
        println("$winner won!")
    }

}