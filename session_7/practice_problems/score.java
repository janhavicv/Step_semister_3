class score {
    private boolean[] results;
    private int count;
    private final int totalQuestions;

    score(int n) {
        totalQuestions = n;
        results = new boolean[n];
        count = 0;
    }

    void recordAnswer(boolean result) {
        if (count < totalQuestions) {
            results[count] = result;
            count++;
        } else {
            System.out.println("All answers recorded");
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        score sc = new score(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());
    }
}