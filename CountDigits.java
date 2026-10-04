public class CountDigits {

    public static int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num > 0) {

            int digit = num % 10;

            if (original % digit == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 1248;

        System.out.println(countDigits(num));
    }
}
