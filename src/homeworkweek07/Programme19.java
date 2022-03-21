package homeworkweek07;

public class Programme19 {
    public static void main(String[] args) {
        int[] number=new int[]{20,30,40,50,60,-100};
        //calculate sum of all array elements
        int sum =0;
                for (int i=0; i < number.length ; i++)
                    sum=sum+ number[i];
                //calculate average value
        double average = sum/number.length;
        System.out.println("Average value of the array element is :"+ average);

    }
}
