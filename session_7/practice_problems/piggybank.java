class piggybank {
    private int savings;
    private final String id;

    piggybank(String id) {
        this.id = id;
        savings = 0;
    }
    void deposit(int amount) {
        if (amount > 0) {
            savings = savings + amount;
        }
    }
    void withdraw(int amount) {
        if (amount > 0 && amount <= savings) {
            savings = savings - amount;
        } else {
            System.out.println("Withdrawal rejected");
        }
    }

    int getSavings() {
        return savings;
    }

    public static void main(String[] args) {
        piggybank pb = new piggybank("PB-1");
        pb.deposit(100);
        System.out.println("Savings: " + pb.getSavings());
        pb.withdraw(30);
        System.out.println("Savings: " + pb.getSavings());
        pb.withdraw(500);
        System.out.println("Savings: " + pb.getSavings());
    }
}