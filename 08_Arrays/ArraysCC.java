import java.util.*;
public class ArraysCC {

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextInt(); //Physics
        marks[2] = sc.nextInt(); //Chemistry
        marks[3] = sc.nextInt(); //Maths

        System.out.println("Physics marks: " + marks[0]);
        System.out.println("Chemistry marks: " + marks[2]);
        System.out.println("Maths marks: " + marks[3]);

 }
}