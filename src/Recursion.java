public class Recursion {

    public static int padovan(int n) {
        if( n == 0 || n == 1 || n == 2) {
            return 1;
        }

        return padovan(n-2) + padovan(n-3);
    }
    public static void main(String[] args) {
        System.out.println(padovan(15));
    }
}
