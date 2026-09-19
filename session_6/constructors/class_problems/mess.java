class mess {
    private double balance;

    mess(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    void topUp(double amount) {
        if (amount <= 0)
            System.out.println("Invalid amount");
        else
            balance += amount;
    }

    void deduct(double amount) {
        if (amount > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        mess w = new mess(500);

        w.topUp(200);
        System.out.println("Balance after top-up: " + w.getBalance());

        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}