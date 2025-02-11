package  DynamicProgramming;
import java.util.Scanner;
public class FactorialFxnByTabulation {
    public static long Fact(int num)
    {
      int tab[] = new int[num+1];
      //tab[0] already = 0
      tab[1]=1;
      for(int i=2;i<=num;++i)
      {
        tab[i]=tab[i-1]+tab[i-2];
      }
      return tab[num];

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
    System.out.println("Fibonacci(" + num + ") = " + Fact(num));
    }
}
