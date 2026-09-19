class lib {
    String title, author;
    int copiesAvailable;

    lib(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        copiesAvailable = copies;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        lib[] b = {
            new lib("Clean Code", "Robert C. Martin", 3),
            new lib("Effective Java", "Joshua Bloch", 5),
            new lib("Refactoring", "Martin Fowler", 0),
            new lib("Design Patterns", "GoF", 2)
        };

        for (lib x : b)
            x.printEntry();
    }
}