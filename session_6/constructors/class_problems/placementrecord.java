class placementrecord {
    String studentName;
    String company;
    double packageLpa;

    placementrecord(String name, String company, double pack) {
        studentName = name;
        this.company = company;
        packageLpa = pack;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        placementrecord[] p = {
            new placementrecord("Ravi", "TCS", 4.5),
            new placementrecord("Anitha", "Zoho", 6.2),
            new placementrecord("Karthik", "Infosys", 4.0)
        };

        for (placementrecord x : p) {
            x.printRecord();
        }
    }
}