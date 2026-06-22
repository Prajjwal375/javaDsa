import java.util.*;

public class practice {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in) ;
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = (a+b+c)*18/100;
        float bill = a + b + c +d;
        System.out.println("Total bill:" + bill);
        //System.out.println("Average:" + (a+b+c)/3);
        }
}