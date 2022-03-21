package homeworkweek07;
//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
      //  /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;
public class Programme10 {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int  num1=scan.nextInt();

        System.out.println("Entre the second number");
        int num2=scan.nextInt();

        System.out.println("Enter the operator you want(+,-,*,/):");
        ch=scan.next().charAt(0);
        if (ch=='+'){
            System.out.println("/nAddition of "+num1+"+"+num2+"="+(num1+num2));
        }
        else if(ch=='_'){
            System.out.println("Substraction of"+num1+"_"+num2+"="+((num1-num2)));
        }
        else if(ch=='*'){
            System.out.println("Multiplication of "+num1+"x"+num2+"="+(num1*num2));
        }
        else if(ch=='/'){
            System.out.println("division of"+num1+"/"+num2+"="+(num1/num2));
        }
        else {
            System.out.println("Operator is not available");
        }
    }
}
