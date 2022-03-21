package homeworkweek07;

import java.util.Scanner;
public class Programme05 {
    public static void main(String[] args) {
        Scanner Input=new Scanner (System.in);
        System.out.println("Enter Employee ID :");
        int eid=Input.nextInt();
        System.out.println("Enter Employee Name  : ");
        String name = Input.next();
        System.out.println("Enter Employee Salary :");
        int salary= Input.nextInt();
        float hra =(salary*10/100);//HRA 10%
        float da =(salary*8/100);//TA 8%
        float ta =(salary*9/100);//DA 9%
        float pf =(salary*20/100);//PF-20%

        float grossSalary = salary +hra +ta +da- pf;
        System.out.println("------------------------------------");
        System.out.println("|          Salary Sleep             |");
        System.out.println("|                                   |");
        System.out.println("| Employee Id  : "+eid +"           |" );
        System.out.println("| Employee name: " +name+"           |");
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("|Basic Salary  : " +salary+"           |");
        System.out.println("|HRA 10%       :" +hra+"               |");
        System.out.println("| TA 8%        :" +ta+"                |");
        System.out.println("| DA 9%        :" +da+"                |");
        System.out.println("| PF-20%       :" +pf+"                |");
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("| Gross Salary  :"+grossSalary+"        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|---------------------------------------|");












    }
}
