package com.example.helloworld

import kotlin.math.max

/*var content: String? = "hello"

fun printUpperCase(){
    val uppercase = content?.toUpperCase()
    println(uppercase)
}*/

fun printParams(num: Int = 200, str: String){
    println("num is $num, str is $str")
}

fun main(){

    printParams(str = "world")

    /*if(content != null){
        printUpperCase()
    }*/

   /* val text = "abcdefg"
    val length = getTextLength(text)
    println(length)
    println(getTextLength(null))*/

    //doStudy(null)

    /*Thread{
        val id = Thread.currentThread().id
        println("Thread $id is running")
    }.start()*/

    /*val list = listOf("Apple", "Banana", "Orange", "Watermelon")
    val anyResult = list.any{ it.length <= 5 }
    val allResult = list.all{ it.length <= 5 }
    println("anyResult is $anyResult, allResult is $allResult")*/

    /*val newList = list.filter{ it.length <= 5}.map{ it.toUpperCase() }
    for(fruit in newList){
        println(fruit)
    }*/

    /*val newList = list.map{it.toUpperCase()}
    for(fruit in newList){
        println(fruit)
    }*/

//    val lambda = { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy { fruit -> fruit.length }
//    val maxLengthFruit = list.maxBy{it.length}
 //   println("max length fruit is $maxLengthFruit")

    /*val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Orange"] = 3

    val number = map["Apple"]
    println(number)

    for((fruit, number) in map){
        println("furit is $fruit, number is $number.")
    }*/

    /*val set = setOf("Apple", "Banana", "Orange")
    for(fruit in set){
        println(fruit)
    }*/

    /*val list = ArrayList<String>()
    list.add("Apple")
    list.add("Banana")
    list.add("Orange")*/

    // listOf()函数创建的是不可变的集合
    // mutableListOf()函数创建的是可变的集合

    // val list = listOf("Apple", "Banana", "Orange")

    /* val list = mutableListOf("Apple", "Banana", "Orange")
    list.add("Watermelon")*/

   /* for(fruit in list){
        println(fruit)
    }*/


   //Singleton.singletonTest()

    /*val c1 = Cellphone("Samsung", 1299.9)
    val c2 = Cellphone("Samsung", 1299.9)
    println(c1)
    println("c1 equals c2: " + (c1 == c2))*/

    /*val student = Student("Inda", 22)
    doStudy(student)*/

//    val name = "Tommy"
//    val score = getScore3(name)
//    println("$name's score is $score")

    /*for(i in 0..10){
        println(i)
    }*/

    /*for(i in 0 until 10 step 2){
        println(i)
    }*/

   /*for(i in 10 downTo 1 step 2){
        println(i)
    }*/

    /*val p = Person()
    p.name = "Jack"
    p.age = 20
    p.eat()*/

    /*val s = Student()
    s.name = "Inda"
    s.age = 22
    s.sno = "3117005249"
    s.grade = 1
    s.eat()*/

    /*val s = Student("3117005249",1, "Inda", 22)
    val s1 = Student("Inda", 22)
    val s2 = Student()
    s.eat()
    s1.eat()
    s2.eat()*/

}

fun getTextLength(text: String?) = text?.length ?: 0


fun doStudy(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomework()
    }

    /*study?.readBooks()
    study?.doHomework()*/

    /*if (study != null) {
        study.readBooks()
        study.doHomework()
    }*/
}

fun getScore3(name: String) = when{
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number){
    when(num){
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

fun getScore2(name :String) = when(name){
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun getScore(name: String) = if(name == "Tom"){
    86
}else if(name == "Jim"){
    77
}else if(name == "Jack"){
    95
}else if(name == "Lily"){
    100
}else{
    0
}

fun largerNumber(num1: Int, num2: Int): Int{
//    return max(num1, num2)
    val value = if(num1 > num2){
        num1
    }else{
        num2
    }
    return value
}

fun largerNumber2(num1: Int, num2: Int) = max(num1, num2)

fun largerNumber3(num1: Int, num2: Int) = if(num1 > num2) num1 else num2