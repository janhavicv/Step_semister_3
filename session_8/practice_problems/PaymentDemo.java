import java.util.*;

interface Payment {
    double calculate(double amount);
}

class Card implements Payment {
    public double calculate(double amount) {
        return amount * 1.02;
    }
}

class Wallet implements Payment {
    public double calculate(double amount) {
        return amount * 1.01;
    }
}

class BankTransfer implements Payment {
    public double calculate(double amount) {
        return amount;
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Payment p;

            if (type.equals("CARD"))
                p = new Card();
            else if (type.equals("WALLET"))
                p = new Wallet();
            else
                p = new BankTransfer();

            double result = p.calculate(amount);
            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}