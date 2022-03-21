package homeworkweek07;
import java.util.Scanner;
public class Programme03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student name :");
        String studentname = scanner.next();
        System.out.print("roll no :");
        int rollno = scanner.nextInt();
        System.out.print("subject name:");
        System.out.print("maths :");
        int maths = scanner.nextInt();
        System.out.print("science :");
        int science = scanner.nextInt();
        System.out.print("English :");
        int english = scanner.nextInt();
        int total = maths + science + english;
        float per = total*100/300;

        if(maths <=0 || maths >=100){
            System.out.println("invalid maths marks");
        } else if(science <=0 || science >=100){
            System.out.println("invaild science marks");
        } else if(english <=0 || science >=100){
            System.out.println("invalid enlish marks");
        } else {
            System.out.println("invalid alphabets");
        }
        String result;
        String grade;
        if(per >= 80){
            result = "pass";
            grade = "A+";
        } else if(per <= 80 && per >= 60){
            result = "pass";
            grade = "A";
        } else if(per <= 60 && per >= 50){
            result = "pass";
            grade = "B";
        } else if(per <= 50 && per >= 35){
            result = "pass";
            grade = "C";
        } else {
            result = "Fail";
            grade = "";
        }

        System.out.println("----------------------------------------");
        System.out.println("|                                       |");
        System.out.println("|             Marksheet                 |");
        System.out.println("|                                       |");
        System.out.println("|---------------------------------------|");
        System.out.println("|    name        :       " + studentname + "       |");
        System.out.println("|    Roll No     :       " + rollno + "        |");
        System.out.println("|-------------------------------------- |");
        System.out.println("|    Subjects    :       " + "Marks" + "   |");
        System.out.println("|---------------------------------------|");
        System.out.println("|     Math       :        " + maths + "      |");
        System.out.println("|     Science    :        " + science + "      |");
        System.out.println("|     English    :        " + english + "      |");
        System.out.println("|---------------------------------------|");
        System.out.println("|     Toal       :        " + total + "     |");
        System.out.println("|---------------------------------------|");
        System.out.println("|     Percentage :        " + per + "       |");
        System.out.println("|     Result     :        " + result + "    |");
        System.out.println("|     grade     :        " + grade + "    |");
        System.out.println("|---------------------------------------|");

    }
        
}




