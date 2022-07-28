package Assignment_2;

import java.security.PublicKey;
import java.util.Scanner;

public class Assignment_2 {
//    # [Video Link](https://youtu.be/ldYLYRNaucM)
//            ## Write Java programs for the following:
//
//            ### Basic Java Programs
//1. Area Of Circle Java Program
//2. Area Of Triangle
//3. Area Of Rectangle Program
//4. Area Of Isosceles Triangle
//5. Area Of Parallelogram
//6. Area Of Rhombus
//7. Area Of Equilateral Triangle
//8. Perimeter Of Circle
//9. Perimeter Of Equilateral Triangle
//10. Perimeter Of Parallelogram
//11. Perimeter Of Rectangle
//12. Perimeter Of Square
//13. Perimeter Of Rhombus
//14. Volume Of Cone Java Program
//15. Volume Of Prism
//16. Volume Of Cylinder
//17. Volume Of Sphere
//18. Volume Of Pyramid
//19. Curved Surface Area Of Cylinder
//20. Total Surface Area Of Cube
//21. Fibonacci Series In Java Programs
//22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
//            23. Input a number and print all the factors of that number (use loops).
//            24. Take integer inputs till the user enters 0 and print the sum of all numbers
//            (HINT: while loop)
//25. Take integer inputs till the user enters 0 and print the largest number from
//    all.
//26. Addition Of Two Numbers
//
//### Intermediate Java Programs
//1. Factorial Program In Java
//2. Calculate Electricity Bill
//3. Calculate Average Of N Numbers
//4. Calculate Discount Of Product
//5. Calculate Distance Between Two Points
//6. Calculate Commission Percentage
//7. Power In Java
//8. Calculate Depreciation of Value
//9. Calculate Batting Average
//10. Calculate CGPA Java Program
//11. Compound Interest Java Program
//12. Calculate Average Marks
//13. Sum Of N Numbers
//14. Armstrong Number In Java
//15. Find Ncr & Npr
//16. Reverse A String In Java
//17. Find if a number is palindrome or not
//18. Future Investment Value
//19. HCF Of Two Numbers Program
//20. LCM Of Two Numbers
//21. Java Program Vowel Or Consonant
//22. Perfect Number In Java
//23. Check Leap Year Or Not
//24. Sum Of A Digits Of Number
//25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//            26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1. Area Of Circle Java Program
//        float pi = 3.14f;
//        System.out.println("Enter the radius:- ");
//        float r =sc.nextFloat();
//        float area_of_Circle =pi*(r*r);
//        System.out.println("Area of Circle = "+area_of_Circle);
        //2. Area Of Triangle
//        System.out.println("Enter the base:- ");
//        float base =sc.nextFloat();
//        System.out.println("Enter the height:- ");
//        float height =sc.nextFloat();
//        float area_of_Triangle =1/2*base*height;
//        System.out.println("Area of Triangle = "+area_of_Triangle);
        //3. Area Of Rectangle Program
//          System.out.println("Enter the length:- ");
//          int l = sc.nextInt();
//          System.out.println("Enter the breath:- ");
//          int b = sc.nextInt();
//          int area_of_Rectangle =l*b;
//          System.out.println("area of rectangle = "+area_of_Rectangle);
        //4. Area Of Isosceles Triangle
//           System.out.println("Enter the base:- ");
//           float base =sc.nextFloat();
//           System.out.println("Enter the height:- ");
//           float height =sc.nextFloat();
//           float area_of_ISO_Triangle =(base*height)/2;
//           System.out.println("Area of Triangle = "+area_of_ISO_Triangle);
        //5. Area Of Parallelogram
//             System.out.println("Enter the base:- ");
//             int b = sc.nextInt();
//             System.out.println("Enter the height:- ");
//             int h = sc.nextInt();
//             int area_of_parallelogram =b*h;
//             System.out.println("Area of parallelogram:- "+area_of_parallelogram);

        // Palindrome Number
//        System.out.println("Enter x:- ");//121
//        int x = sc.nextInt();
//        int num=0,origin_Num=x;
//        while(x>0){
//            int rem = x%10;
//            num = num*10+rem;
//            x/=10;
//        }
//        if (num==origin_Num){
//            System.out.println(origin_Num+" is an Palindrome number");
//        }else {
//            System.out.println(origin_Num+" is not an Palindrome number");
//        }
//        6. Area Of Rhombus
//           System.out.println("Enter the base1:- ");
//           float base1 =sc.nextFloat();
//           System.out.println("Enter the base2:- ");
//           float base2 =sc.nextFloat();
//           float area_of_ISO_rhombus =(base1*base2)/2;
//           System.out.println(area_of_ISO_rhombus);
//        7. Area Of Equilateral Triangle
//            System.out.println("Enter the area:- ");
//            float a =sc.nextFloat();
//            float Area_of_equilateral_triangle =()*(a)*2;
//            System.out.println(Area_of_equilateral_triangle);
//        8. Perimeter Of Circle
//        9. Perimeter Of Equilateral Triangle
//        10. Perimeter Of Parallelogram
//        11. Perimeter Of Rectangle
//        12. Perimeter Of Square
//        13. Perimeter Of Rhombus
//        14. Volume Of Cone Java Program
//        15. Volume Of Prism
//        16. Volume Of Cylinder
//        17. Volume Of Sphere
//        18. Volume Of Pyramid
//        19. Curved Surface Area Of Cylinder
//        20. Total Surface Area Of Cube
        //21. Fibonacci Series In Java Programs
//          System.out.println("enter the Number of fibonacci position:- ");
//          int n = sc.nextInt();
//          System.out.print("0,1");
//          int a=0,b=1,sum;
//          for (int i=1;i<=n;i++){
//              sum = a+b;
//              System.out.print(","+sum);
//              a=b;
//              b=sum;
//          }
    //22. [Subtract the Product and Sum of Digits of an Integer]
//         (https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
//        System.out.println("Enter the value of n:- ");
//        int n=sc.nextInt();
//        int POD=1,SOD=0,result;
//        while(n>0){
//            int rem = n%10;
//            POD = rem*POD;
//            SOD = SOD+rem;
//            n=n/10;
//        }
//        result = POD-SOD;
//        System.out.println(result);
        // 23. Input a number and print all the factors of that number (use loops).
//        System.out.println("Enter the number:- ");
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i=n;i>=1;i--){
//             fact = fact*i;
//        }
//        System.out.println(fact);
        //24. Take integer inputs till the user enters 0 and print the sum of all numbers
        //  (HINT: while loop)
//        int Sum=0;
//        while (true){
//            System.out.println("Enter the value A = ");
//            int a = sc.nextInt();
//            Sum = Sum+a;
//            System.out.println("press 0 to exit the loop");
//            if (a==0){
//                break;
//            }
//        }
//        System.out.println("Sum of all Number = "+Sum);
       // 25. Take integer inputs till the user enters 0 and print the largest number from all.
        int small = 0;
        int lrg = 0;
        while (true){
            System.out.println("Enter the number:- ");
            lrg=sc.nextInt();

            if (){

            } else if (lrg==0) {
                break;
            }
        }
    }
}
