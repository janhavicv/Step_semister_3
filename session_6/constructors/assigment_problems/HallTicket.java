class HallTicket {
    String studentName;
    int seatNumber;
    HallTicket(String name, int seat) {
        studentName = name;
        seatNumber = seat;
    }
    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya;
        copy.seatNumber = 45;
        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("Riya's seatNumber: " + priya.seatNumber);
        System.out.println("copy == Riya: " + (copy == priya));
        System.out.println("separate == Riya: " + (separate == priya));
    }
}