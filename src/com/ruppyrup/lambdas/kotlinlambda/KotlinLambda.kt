package com.ruppyrup.lambdas.kotlinlambda

class KotlinLambda {

    fun calculate(a: Int, b: Int, c: (x: Int, y: Int) -> Int) {
        println(c(a, b))
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

}

fun main() {
    val myclass = KotlinLambda()
    myclass.calculate(4, 7, myclass::sum )
}