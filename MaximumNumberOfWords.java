public class MaximumNumberOfWords {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int spaces = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }

            int words = spaces + 1;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        System.out.println(mostWordsFound(sentences));
    }
}