import java.util.*;
public class Hollow_rectangle {

    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner column
            for(int j=1; j<=totCols; j++) {
                //  cell - (i,j)
                if( i==1 || i==totRows || j==1 || j==totCols ){
                    // boundary cells
                    System.out.print("*"+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        hollow_rectangle(rows, cols);
    }
    
}