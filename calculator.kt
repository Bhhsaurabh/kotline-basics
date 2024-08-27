import java.util.Scanner;
class calculator {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            // program 1
           val reader = Scanner(System.`in`);
            println("Enter num-> 1(addition) - 2(Subtraction) - 3(multiplication) - 4(division): ");
            val num:Int = reader.nextInt();
            print("Enter number1: ");
            val num1 = reader.nextFloat();
            print("Enter number2: ");
            val num2 = reader.nextFloat();
            var result:Float = 0.0f;
            when(num){
                1-> result = num1 + num2;
                2-> result = num1 - num2;
                3-> result = num1 * num2;
                4-> result  = num1 /num2;
                else -> println("Enter choose valid operator: ex-1,2,3,4 : ");
            }
            println(result)
        }
    }
}