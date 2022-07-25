package Counting_the_same_num;
import java.util.Scanner;

public class Counting_the_same_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:- ");
        int num = sc.nextInt();
        System.out.println("Enter the Number u want to check:- ");
        int check = sc.nextInt();
        int count = 0;
        while (num>0){
            int rem = num%10;
            if (rem == check){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
