package homeworkweek07;
import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly (use switch case) if
//any other alphabet should be invalid entry
public class Programme09 {
    public static void main(String[] args) {

        char city='A';
        switch(city) {
            case 'A': System.out.println("Amreli"); break;
            case 'B': System.out.println("Baroda"); break;
            case 'C': System.out.println("calcatta"); break;
            case 'D': System.out.println("Dallas"); break;
            case 'E': System.out.println("England"); break;
            case 'F': System.out.println("Firozabad"); break;
            default : System.out.println("Invalid day"); break;

        }
    }
    }