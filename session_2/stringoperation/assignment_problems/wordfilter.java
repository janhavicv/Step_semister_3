public class wordfilter {
    static void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        int[] count = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            boolean stopWord = false;
            for (int j = 0; j < stopWords.length; j++) {

                if (words[i].equals(stopWords[j])) {
                    stopWord = true;
                    break;
                }
            }
            if (stopWord) {
                continue;
            }
            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {

                if (words[i].equals(words[j])) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
    public static void main(String[] args) {
        String feedback =
                "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(feedback);
    }
}