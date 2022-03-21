package homeworkweek07;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

public class Programme08 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other
    public static void main(String[] args) {
        char city = 'A';
        if (city == 'A')
        {
            System.out.println("Amreli");
        } else if (city == 'B') {
            System.out.println("Baroda");
        } else if (city == 'C') {
            System.out.println("culcatta");
        } else if (city == 'D') {
            System.out.println("Dallas");
        } else if (city == 'E') {
            System.out.println("England");
        } else if (city == 'F') {
            System.out.println("Firozabad");
        } else {
            System.out.println("Invalid");

        }
    }
}
