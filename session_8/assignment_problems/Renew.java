import java.time.LocalDate;
import java.util.*;

abstract class Plan {
    String name;
    LocalDate date;

    Plan(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }

    abstract int validity();

    LocalDate calculate() {
        return date.plusDays(validity());
    }
}

class Basic extends Plan {
    Basic(String name, String date) {
        super(name, date);
    }

    int validity() {
        return 30;
    }
}

class Standard extends Plan {
    Standard(String name, String date) {
        super(name, date);
    }

    int validity() {
        return 90;
    }
}

class Premium extends Plan {
    Premium(String name, String date) {
        super(name, date);
    }

    int validity() {
        return 365;
    }
}

public class Renew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String date = sc.next();
            Plan p;

            switch (type) {
                case "BASIC":
                    p = new Basic(name, date);
                    break;
                case "STANDARD":
                    p = new Standard(name, date);
                    break;
                default:
                    p = new Premium(name, date);
            }

            System.out.println(name + ": " + p.calculate());
        }

        sc.close();
    }
}