public class FriendsPairing {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
    public static int friendsPairing(int n) {
        // base case
        if(n == 1 || n == 2) {
            return n;
        }

        // single
        int fnm1 = friendsPairing(n-1);

        // pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        return fnm1 + pairWays;
    }
}