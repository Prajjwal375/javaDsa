import java.util.*;
public class Binomial {


public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
public static int binCoeff(int n, int r){
    int nfact = factorial(n);
    int rfact = factorial(r);   
    int nminusrfact = factorial(n-r);
    
    int binCoeff = nfact / (rfact * nminusrfact);
    return binCoeff;
}



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println("Binomail Coefficient is : " + binCoeff(n, r));
        
        
        
        
    }
}