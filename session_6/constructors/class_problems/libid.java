class libid {
    String name;
    int booksIssued;

    libid(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        libid ravi = new libid("Ravi", 0);

        libid duplicate = ravi;

        duplicate.booksIssued = 3;

        libid separate = new libid("Ravi", 3);

        System.out.println("Ravi's booksIssued: " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}