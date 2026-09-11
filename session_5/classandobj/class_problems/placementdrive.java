import java.util.Arrays;
class placementdrive implements Comparable<placementdrive> {
    private String name;
    private double cgpa;
    private int codingScore;

    placementdrive(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }
    double getCompositeScore() {
        return cgpa * 10 + codingScore;
    }
    public int compareTo(placementdrive other) {
        return Double.compare(other.getCompositeScore(),
                              this.getCompositeScore());
    }
    static String shortlistAndRank(placementdrive[] candidates) {
        placementdrive[] shortlisted = new placementdrive[candidates.length];
        int count = 0;
        for (placementdrive c : candidates) {
            if (isEligible(c.cgpa) ||
                isEligible(c.cgpa, c.codingScore)) {

                shortlisted[count] = c;
                count++;
            }
        }

        shortlisted = Arrays.copyOf(shortlisted, count);
        Arrays.sort(shortlisted);
        String result = "";
        for (int i = 0; i < shortlisted.length; i++) {
            result = result + (i + 1) + ". "
                    + shortlisted[i].name + " ("
                    + shortlisted[i].getCompositeScore() + ")";

            if (i < shortlisted.length - 1) {
                result = result + " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        placementdrive[] candidates = {
            new placementdrive("Aisha", 8.2, 40),
            new placementdrive("Rohit", 6.8, 65),
            new placementdrive("Meena", 6.0, 90),
            new placementdrive("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}