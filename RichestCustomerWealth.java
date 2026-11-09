public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] row : accounts) {
            int sum = 0;

            for (int amount : row) {
                sum += amount;
            }

            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
}