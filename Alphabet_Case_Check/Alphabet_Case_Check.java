package Alphabet_Case_Check;
import java.util.Scanner;

public class Alphabet_Case_Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <='z'){
            System.out.println("The give Letter "+ch+" is lowe case");
        }else {
            System.out.println("The give Letter "+ch+" is Upper case");
        }

    }
}
