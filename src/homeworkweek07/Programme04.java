package homeworkweek07;

import java.util.Scanner;

public class Programme04 {

    public static boolean isLeapYear(int Year){
        boolean a;
        if (Year >=1 && Year <=9999){
            a=true;
            if (Year % 4 ==0 || Year %400 == 0 && Year % 100 !=0) {
                a = true;
                System.out.println(Year + "Year is Leap Year");
            } else {
                System.out.println(Year+ "Year is not Leap Year");
                }
            }
        else {
            a=false;
            System.out.println(Year+ " The parameter is not in the range(1-9999)");
        }
            return a;
        }
        public static int getDaysInMonth(int month1, int Year2){
        int day;
        switch(month1){
            case 1: day =31;
            break;
            case 2:
                boolean res = isLeapYear(Year2);
                if (res == true)
                {
                    day = 29;
                }
                else {
                    day = 28;
                }
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
                case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
            case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;

            default:
                day = -1;
        }
        return day;
        }

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter year:" );
        int Year1 = Input.nextInt();
        System.out.println(isLeapYear(Year1));
        System.out.println("Enter Month:");
        int month1 = Input.nextInt();
        System.out.println("Enter Year:");
        int year2 = Input.nextInt();
        System.out.println("Month " +month1+ " has " +getDaysInMonth(month1,year2) + " days");
    }
    }


