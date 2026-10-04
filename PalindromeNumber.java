public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse only the second half
        while (x > reversed) {
            reversed = reversed * 10 + (x % 10);
            x = x / 10;
        }

        // Even digits: x == reversed
        // Odd digits: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}
