// import java.util.*;
// public class Conditional_Practice {
//     public static void main (String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int income = sc.nextInt();
//         int tax;

//         if(income <= 500000) {
//             System.out.println("No tax");
//             tax = 0;
//             } else if ( income <= 1000000) {
//                 tax = (int)(0.2 * income);
//                 System.out.println("Tax is: " + tax);
//             } else {
//                 tax = (int)(0.3 * income);
//                 System.out.println("Tax is: " + tax);
//             }
            
//         }
//     }



// import java.util.*;
// public class Conditional_Practice {
//     public static void main (String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
        
//     if( A>=B && A>=C) {
//         System.out.println(A + " is the largest number"); 
//     }
//     else if( B>=A && B>=C) {
//         System.out.println(B + " is the largest number");   
//         }
//         else {
//             System.out.println(C + " is the largest number");
//         }
//     }
// }



import java.util.*;
public class Conditional_Practice {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  ");
        int A = sc.nextInt();
        System.out.print("Enter b  ");
        int B = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println("Addition: " + (A + B));
                break;
            case '-':
                System.out.println("Subtraction: " + (A - B));
                break;
            case '*':
                System.out.println("Multiplication: " + (A * B));
                break;
            case '/':
                System.out.println("Division: " + (A / B));
                break;
            case '%':
                System.out.println("Modulus: " + (A % B));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}





import java.util.*;
public class Conditional_Practice {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weeh number(1-7) :  ");
        int week = sc.nextInt();

        switch(week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week no. ");
        }
    }
}





import java.util.*;
public class Conditional_Practice {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Input the year : ");
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 400 == 0);

        if ( x && (y || z) ) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        
    }
}