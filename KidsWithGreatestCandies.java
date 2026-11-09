import java.util.*;

public class KidsWithGreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        for (int c : candies) {
            max = Math.max(max, c);
        }

        List<Boolean> result = new ArrayList<>();

        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}