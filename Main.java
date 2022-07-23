import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary amount:- ");
        int Salary = sc.nextInt();

        if (Salary > 10000){
            int bouns = Salary + 1000;
            System.out.println("boohoo, you have an increment of 1000 \n         Now Your Total Salary of this months is "+bouns);
        }else {
            System.out.println("Sorry buddy no bonus this time for you \n          your Salary is as usual "+Salary);
        }
    }
}