import com.sun.jdi.IntegerType
// to declare variable use
// var a: Dataypes or
// val a = 20

class Person{
    var name:String = "golu kumar"
    val age:Int = 19
    fun display(){
        println("Name: $name age: $age")
    }
}
fun main() {
//  val a = readLine()!!.toInt()
//  val b = readLine()!!.toInt() // val is const type which value cant be changed
//    var c:Int
//    c = a + b
   // println("******** " + c + " *******")
    // take input and print which is greater
//    val a = readLine()
//    val b = readLine().
//    print("Is a is greater than b: ")
//    println(a>b)
////    printHello(5)
//    val a = 10
//    val b = 20
//    val result = "Sum of the $a and $b  is ${a+b}"
//    println(result)
    val person = Person()  // create object
    person.display()
}
fun printHello(a:Int){
    var name:String = "Saurabh kumar"
    println("hello i am " + name)
}
