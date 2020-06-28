package br.com.paiter.valorizeiapi.playground

class Playground {

}

fun main(args: Array<String>) {

    // Loops
    for (i in 1..3) {
        for (j in 1..3) {
            println("Romildo $i $j")
            if (i == 2 && j == 2) break
        }
    }

    var i:Int = 1
    while(i <= 10) {
        print(i)
        i++
    }
    println()

    var a:Int = 10
    do {
        println(a)
        a--
    } while(a >= 1)

}

