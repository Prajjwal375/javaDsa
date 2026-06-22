public class ConvertString {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    
    public static void printDigits(int number) {
        // base case
        if(number == 0){
            return;
        }

        int lastDigits = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigits]+" ");
    }

    public static void main(String[] args) {
        int number = 1940;
        printDigits(number);
    } 
}