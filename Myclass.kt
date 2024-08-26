class Myclass {
    companion object{
      @JvmStatic
      fun main(args:Array<String>){
//          print("hello saurabh")
          var a = 5
          // right shift shr , left shift shl
//          println(a shl  2)
          var x = 20
          var y = 30
          // inv operation
          val newNum = x.inv()

          //elvis operator
          val str:String? = null
//          println(str)
//
          // switches
          val choice = 2
          val result = when(choice){
              1->"hello"
              2->"hii"
              3->"why"
              4->"where"
              else -> "not found"
          }
//          println(result)
          for(i in 1..5){
//              println(i)
          }
          for(i in 5 downTo 2){
//              println(i)
          }
          for(i in 1..10 step 2){
//              println(i)
          }
          // while loop
          var ar:Int = 2
          //
          while(ar<10){
             // println(ar)
              ar++
          }
          var i:Int = 2
          // do while loop
          do{
              println("hello")
              i++
          }while(i<=10)
      }
    }
}