
import java.util.*;

interface DeliveryService {
    double calculateFee();
}

class StandardDelivery implements DeliveryService {
    double weight, distance;

    StandardDelivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double calculateFee() {
        return 5 + 0.50 * weight + 0.10 * distance;
    }
}

class ExpressDelivery implements DeliveryService {
    double weight, distance;

    ExpressDelivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double calculateFee() {
        return 15 + weight + 0.20 * distance;
    }
}

class InternationalDelivery implements DeliveryService {
    double weight, distance, customsFee;

    InternationalDelivery(double weight, double distance,
                         double customsFee) {
        this.weight = weight;
        this.distance = distance;
        this.customsFee = customsFee;
    }

    public double calculateFee() {
        return 25 + 2 * weight + 0.50 * distance
                + customsFee;
    }
}

class DeliveryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();

            DeliveryService d;

            if (type.equals("STANDARD")) {
                d = new StandardDelivery(weight, distance);
            } else if (type.equals("EXPRESS")) {
                d = new ExpressDelivery(weight, distance);
            } else {
                double customsFee = sc.nextDouble();

                d = new InternationalDelivery(
                        weight, distance, customsFee);
            }

            double fee = d.calculateFee();

            System.out.printf("%s: %.2f%n", type, fee);
            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
