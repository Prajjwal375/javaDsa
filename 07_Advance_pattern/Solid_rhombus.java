import java.util.*;

public class Solid_rhombus {

    public static void Solid_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces n-1
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // stars n
            for (int j = 1; j <= n; j++) {
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

        Solid_rhombus(n);
    }
}
