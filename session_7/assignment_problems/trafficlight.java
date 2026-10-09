class trafficlight {
    private String color;
    private final String id;

    trafficlight(String id) {
        this.id = id;
        color = "RED";
    }

    void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {
        trafficlight t = new trafficlight("TL-9");
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
    }
}