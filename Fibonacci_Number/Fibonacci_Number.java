package Fibonacci_Number;
import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:- ");
        int num = sc.nextInt();
        System.out.print("0,1,1");
        int sum=0,a=1,b=1;
        for (int i=0;i<=num-3;i++){
            sum = a+b;
            System.out.print(","+sum);
            a=b;
            b=sum;
        }

    }
}
