import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        // System.out.println("Hello, World!");
        // System.out.print("Hello, World!\n");

        // // PRint pattern
        // System.out.print("****\n");
        // System.out.print("***\n");
        // System.out.print("**\n");
        // System.out.print("*\n");

        // String name = "Alice";
        // int age = 30;
        // System.out.println("Name: " + name + ", Age: " + age);



    // Scanner sc = new Scanner(System.in);
    // String input = sc.nextLine();
    // System.out.println(input);
        


    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // float r = sc.nextFloat();
    // System.out.println("sum:" + (a+b));
    // System.out.println("product:" + (a*b));
    // System.out.println("Area of circle:" + (3.14*r*r));

    // Type casting
    char ch = 'A';
    int number  = ch;
    System.out.println(number);

    // type promotion
    byte b = 5;
    byte a = (byte)(b * 2);  // (byte) is necessary beacause b is converted to int 
    System.out.println(a);
        
    }
}