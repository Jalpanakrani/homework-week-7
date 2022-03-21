package homeworkweek07;
//Write a Java program to sort a numeric array and a string array.
 import java.util.Arrays;
public class Programme17 {
    public static void main(String[] args) {
        int[] x = {
                1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2356, 1456, 2165, 1457, 2456};
        String[] y = {
                "java", "Python", "PHP", "C#", "C programming", "C++"};
        System.out.println("Original numeric array : " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted numeric array :" + Arrays.toString(y));
        System.out.println("Original string array:" + Arrays.toString(y));
        Arrays.sort(y);
        System.out.println("Sorted string array :" + Arrays.toString(y));
    }
}

