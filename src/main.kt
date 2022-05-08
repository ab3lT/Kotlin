import java.util.EnumSet.range

fun main(args: Array<String>){
    println("Hello, World")
    arrayPrint()
    sumOfHundred()
    printAUpToZ()
//    val f={a:Int, b:Int -> a+b}
//        var result = f(8, 43)
//    println("The result of the annonymus function is " ${result})
}

fun arrayPrint(){
    var contacts = arrayOf("AbleD", "Abel", "Biruk", "Tadesse")

    for (name in contacts){
        println(name)
    }
}
fun sumOfHundred(){
    var sum = 0
    var i = 1
    for (int in 0..100) {
        sum += int
    }
    print(sum)
    while(i > 100){
        sum +=i
        println(sum)
        i++
    }
}
fun printAUpToZ(){
    print("a")
    for (i in 'a'..'z'){
        println(i)
    }
}
// Aninymus Functions
//var a:Int = 7
//var b:Int = 8
val f:(Int, Int) -> Int{a,b -> a+b}
var f = {a:Int, b:Int -> a+b}