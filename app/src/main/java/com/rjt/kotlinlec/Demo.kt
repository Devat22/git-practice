package com.rjt.kotlinlec

import java.util.*

fun main() {
//    var a = "Hello World"
//    var b = "This is my first kotlin fun"
//    val c = b //instantiating is ok
//
//    print(c)
//    print("Enter your name")
//    val name:String? = readLine()
//    println(name)
//    print("Enter your age")
//    val read= Scanner(System.`in`)
//    val age:Int = read.nextInt()
//    println("Your age is : "+age)
//    val a:Int = 1
//    val b:Int = 3
//    val returnValue:Int = if(a>b){
//         a
//    }else{
//         b
//    }
//    println(returnValue)
    var number = 8
    var numberProvided:String = when(number){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        8->"eight"
        9->"nine"
        6->"six"
        10->"ten"
        11->"eleven"
        12->"twelve"
        13->"thirteen"
        else -> "invalid number"
    }
    println("You provided $numberProvided")

}
//2 types of strings -Escaped:"you are" you can't use it with multiple lines
// -Raw:""you"" you can write multiple lines

//for not specified data type we use Unit as return for functions
//  Nothing(not known by now),Any for variable data type
//readline() // read line of input it is only for string
//Scanner for reading any type of data
//Is is used here as if in java
