import java.util.*;

abstract class Customer {
    double amt;

    Customer(double amt) {
        this.amt = amt;
    }

    abstract double calculate();
}

class Student extends Customer {
    Student(double amt) {
        super(amt);
    }

    double calculate() {
        return amt * 0.90;
    }
}

class Staff extends Customer {
    Staff(double amt) {
        super(amt);
    }

    double calculate() {
        return amt * 0.95;
    }
}

class Guest extends Customer {
    Guest(double amt) {
        super(amt);
    }

    double calculate() {
        return amt + 10;
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amt = sc.nextDouble();
            Customer c;

            switch (type) {
                case "STUDENT":
                    c = new Student(amt);
                    break;
                case "STAFF":
                    c = new Staff(amt);
                    break;
                default:
                    c = new Guest(amt);
            }

            double ans = c.calculate();
            System.out.printf("%s: %.2f%n", type, ans);
            total += ans;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}