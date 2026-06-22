public class StringLength {
public static int stringLength(String str)  {
    // base case
    if(str.length() == 0) {
        return 0;
    }
    return stringLength(str.substring(1)) + 1;
}

    public static void main(String[] args) {
        String str = "prajjwal saki";
        System.out.println(stringLength(str));


    } 
}