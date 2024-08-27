import kotlin.Array

class Array_conc {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            val arr1 = arrayOf(1,10,3,5,4,16);
            val sum = SumOfArr(arr1);
            println("Sum of num in array is: " + sum);
            OddNum(arr1);
            println();
            EvenNum(arr1);
        }
        fun SumOfArr(arr:Array<Int>): Int {
            var sum:Int = 0;
            for(i in arr){
                sum +=i;
            }
            return sum;
        }
        fun OddNum(arr:Array<Int>){
            print("Odd nums are: ");
            for(i in arr){
                if(i%2 != 0){
                    print(" "+ i);
                }
            }
        }
        fun EvenNum(arr:Array<Int>){
            print("Even nums are : ");
            for(i in arr){
                if(i%2 == 0){
                    print(" " + i);
                }
            }
        }

    }
}