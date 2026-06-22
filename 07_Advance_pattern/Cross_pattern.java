import java.util.*;

public class Cross_pattern {

    public static void Cross_pattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
           for( int j=1; j<=n; j++) {
            if( i==j || j== n-i+1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
           }
            // new line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        Cross_pattern(n);
    }
}
