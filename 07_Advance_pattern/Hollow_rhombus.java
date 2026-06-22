import java.util.*;

public class Hollow_rhombus {

    public static void Hollow_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces n-1
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            
            // hollow rectangle logic - n
            for(int j=1; j<=n; j++) {
                if( i==1 || i==n || j==1 || j==n ){
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

        Hollow_rhombus(n);
    }
}
