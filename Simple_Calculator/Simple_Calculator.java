package Simple_Calculator;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true){
            System.out.println("Enter the Operator:- ");
            char op = sc.next().trim().charAt(0);
            System.out.println();

            if (op == '+'|| op == '-'|| op == '*' || op =='/' || op =='%'){
                System.out.println("Enter the Value of A :- ");
                int num1 = sc.nextInt();
                System.out.println("Enter the Value of B :- ");
                int num2 = sc.nextInt();
                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if (num1!=0||num2!=0){
                        ans = num1/num2;
                    }else {
                        System.out.println("0 can't be divide to any number!");
                    }
                }
                if (op=='%'){
                    ans = num1%num2;
                }
                System.out.println("\n Your Ans = "+ans);
                System.out.println();
                System.out.println("Enter 'X' or 'x' to exit!");
            } else if (op == 'X'||op =='x') {
                break;
            }else {
                System.out.println("Something happened wrong enter again !!"+"\n");
            }
        }
        }
}
