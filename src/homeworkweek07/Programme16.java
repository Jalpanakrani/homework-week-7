package homeworkweek07;

import java.util.Scanner;

//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
public class Programme16 {
    public static void main(String[] args) {
        int num;
        //Scanner class to read value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        num = sc.nextInt();
        //check condition for +ve, -ve and zero
        if (num > 0) {
            System.out.println(num + "is Positive number");
        } else if (num < 0) {
            System.out.println(num + " is Negative number");
        } else {
            System.out.println("It's zero");
        }
    }
}



