package assignment01;
import java.util.Scanner;

public class Assignment01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the ur Name :- ");
//        String number = sc.nextLine();

//        1. Write a program to print whether a number is even or odd, also take
//        input from the user.
//
//        if (number % 2 ==0){
//            System.out.println(number+" is an even number");
//        }else {
//            System.out.println(number+" is an odd number");
//        }

//        2. Take name as input and print a greeting message for that particular name.
//        System.out.println("o ho Hello miss/mr "+number);

//        3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
//        System.out.println("Enter the principal :- ");
//        float P = sc.nextFloat();
//        System.out.println("Enter the Time :- ");
//        float t = sc.nextFloat();
//        System.out.println("Enter the rate :- ");
//        float r = sc.nextFloat();
//        float A = P * (1 + (r*t));
//        System.out.println("Simple Interest :- "+A);

//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
//        System.out.println("Enter the value of A :- ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of B :- ");
//        int B = sc.nextInt();
//        System.out.println("What do you want to do (+, -, *, /) \n'write this codes in a string format' :- ");
//        String c = sc.nextLine();
//        if (c == "+"){
//            System.out.println("A + B = "+(a+B));
//        } else if (c == "-") {
//            System.out.println("A - B = "+(a-B));
//        }else if (c == "*") {
//            System.out.println("A * B = "+(a*B));
//        }else if (c == "/") {
//            System.out.println("A / B = "+(a/B));
//        }
////        5. Take 2 numbers as input and print the largest number.
//        System.out.println("Enter the value of A :- ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of B :- ");
//        int B = sc.nextInt();
//        if (a>B){
//            System.out.println(a+" is largest number");
//        }else {
//            System.out.println(B+" is a largest number");
//        }

//      6. Input currency in rupees and output in USD.
//        System.out.println("Enter the value of ₹ :- ");
//        int a = sc.nextInt();
//        float d = (float)(a*0.013);
//        System.out.println("Value of "+a+ " in USD = "+d);


//        7. To calculate Fibonacci Series up to n numbers.
//        output:- 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...n
//        System.out.println("Enter the Number:- ");
//        int n = sc.nextInt();
//        int f=1,s=1,t=0;
//        System.out.println(f);
//        System.out.println(s);
//        for (int i=3;i<=n;i++){
//            t=f+s; //3rd term = first term + second term
//            System.out.println(t);
//            f=s; //here first term will be the second term
//            s=t; // here second term will be the 3rd term
//        }

//        8. To find out whether the given String is Palindrome or not.
//                System.out.println("Enter the String:- ");
//                String str = sc.next();
//                String rev= "";
//               for (int i=0;i<str.length();i++){
//                   char ch = str.charAt(i);
//                   rev = ch+rev;
//               }
//             System.out.println(rev);

//        9. To find Armstrong Number between two given number.
        int num = 153,temp,result=0;
         while (num <= 0){
            int rem = num%10;
            result += Math.pow(rem,3);
            num=num/10;
         }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

