class locker {
    private String code;
    private final int lockerNumber;

    locker(int number, String code) {
        lockerNumber = number;
        this.code = code;
    }
    void changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode)) {
            code = newCode;
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Wrong current code");
        }
    }

    public static void main(String[] args) {
        locker l = new locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}