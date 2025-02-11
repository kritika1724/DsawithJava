package DynamicProgramming;
import java.util.Scanner;
public class FactorialFxnByMemoization
{
    
    public static long Fact(int num,long memo[])
    {
        if(num<=1){return num;}
        if(memo[num]!=0){return memo[num];}
        memo[num]=Fact(num-1,memo)+Fact(num-2,memo);
        return memo[num];
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();  // Close Scanner to avoid memory leaks
    if (num < 0) {
        System.out.println("Fibonacci is not defined for negative numbers.");
        return;
    }

    long[] memo = new long[num + 1];  // Array to store computed Fibonacci values
    System.out.println("Fibonacci(" + num + ") = " + Fact(num, memo));

 }
}