package homeworkweek07;
import java.util.Scanner;

public class Programme07 {
    //Write a java program input sales id, seller's name, sales amount, and salary basic and
    //then fined this sales
    //Commission
    //Sales amount >= 50,000 35%
    //Sales amount >= 30,000 20%
    // >= 20,000 10%
    //>= 10,000 5%
    //< 10,000 2%
    public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);//creating scanner object
        System.out.println("Enter sales id");//display heading
        int id = obj.nextInt();//storing value
        System.out.println("Enter seller name :");
        String name=obj.next();
        System.out.println("sales Amount :");//heading display
        int sales =obj.nextInt();//storing value
        System.out.println("Salary basic :");//heading display
        int salary =obj.nextInt();
        System.out.println("Sales Commision :--->");
        int commision;
        if (sales>=50000) { // for 100
            commision = 50000 * 35 / 100;
            System.out.println(commision);
        }else if (sales >=30000&& sales<50000){
            commision = 30000 * 20 / 100;
            System.out.println(commision);
        }else if (sales >=20000&& sales<30000){
            commision = 20000 * 10 / 100;
            System.out.println(commision);
        }else if (sales >=10000&& sales<20000) {
            commision = 10000 * 5 / 100;
            System.out.println(commision);

        }else commision = 10000 * 2 / 100;
                System.out.println(commision);}




        }





