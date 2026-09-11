import java.util.Arrays;
class ranker implements Comparable<ranker> {
    String name;
    int matches;
    double avg;
    boolean injured;
    ranker(String name, int matches, double avg, boolean injured) {
        this.name = name;
        this.matches = matches;
        this.avg = avg;
        this.injured = injured;
    }
    static boolean isDraftable(int matches) {
        return matches >= 10;
    }

    static boolean isDraftable(int matches, boolean injured) {
        return matches >= 5 && !injured;
    }

    public int compareTo(ranker r) {
        return Double.compare(r.avg, avg);
    }

    static String draftAndRank(ranker[] players) {
        ranker[] a = new ranker[players.length];
        int n = 0;
        for (ranker r : players) {
            if (isDraftable(r.matches) ||
                isDraftable(r.matches, r.injured)) {
                a[n++] = r;
            }
        }
        a = Arrays.copyOf(a, n);
        Arrays.sort(a);
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += (i + 1) + ". " + a[i].name;
            if (i < a.length - 1)
                s += " | ";
        }
        return s;
    }

    public static void main(String[] args) {
        ranker[] p = {
            new ranker("Virat", 15, 48, false),
            new ranker("Rahul", 7, 55, false),
            new ranker("Sameer", 3, 60, false),
            new ranker("Dev", 12, 20, true)
        };
        System.out.println(draftAndRank(p));
    }
}