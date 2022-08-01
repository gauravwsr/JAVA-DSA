package Methods;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Sum();
    }
    static void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1 :- ");
        int num1=sc.nextInt();
        System.out.print("enter the num2 :- ");
        int num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of "+num1+" + "+num2+" = "+sum);
    }
}
