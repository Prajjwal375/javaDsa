// Print Inverted Half Pyramid

// import java.util.*;
// public class InvHalf_Pyramid {
//     public static void InvHalf_Pyramid(int n) {
//     for(int i=1; i<=n; i++) {
//         for(int j=1; j<=n-i; j++) {
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
    

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt(); 
//         InvHalf_Pyramid(n);
//     }

// }


// Inverted Half=pyramid with numbers
import java.util.*;
public class InvHalf_Pyramid {
    public static void FloydTriangle(int n) {
        int counter = 1;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print(counter + " ");
            counter++;
        }
        
        System.out.println();
    }
}
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        FloydTriangle(n);
    }

}