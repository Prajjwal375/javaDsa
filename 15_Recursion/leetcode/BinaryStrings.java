public class BinaryStrings {
public static void main(String[] args) {
        
        BinaryStrings(3, 0, new StringBuilder());
    }

    public static void BinaryStrings(int n,int lastplace, StringBuilder str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        BinaryStrings(n-1, 0, str.append("0"));

        if(lastplace == 0){
            BinaryStrings(n-1, 1, str.append("1"));
        }


        
    }
}
