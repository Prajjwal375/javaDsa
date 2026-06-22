import java.util.*;

public class Butterfly_pattern {

    public static void Butterfly_pattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
                // stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 2n-2i
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line after each row
            System.out.println();
        }

        // 2nd half

        for (int i = n; i >= 1; i--) {
            // inner loop
                // stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 2n-2i
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        Butterfly_pattern(n);
    }
}
