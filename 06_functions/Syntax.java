import java.util.*;
public class Syntax {

    public static void function1() {
        System.out.println("This is function 1");
    }

    public static int calculateSum(int num1, int num2) // parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
    }
    public static int multiply(int a , int b) {
        return a * b;
    }
    public static int factorial(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //calculateSum(a, b);  // arguments or actual parameters

       // System.out.println("The sum is: " + sum);

        //  int product= multiply(a,b);
        // System.out.println("The product is: " + product);

        int fact = factorial(a);
        System.out.println("The factorial is: " + fact);
    }
}