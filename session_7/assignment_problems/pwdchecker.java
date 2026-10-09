class pwdchecker {
    private final String password;

    pwdchecker(String password) {
        this.password = password;
    }

    String getStrength() {
        int length = password.length();
        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        pwdchecker pc1 = new pwdchecker("abcd");
        pwdchecker pc2 = new pwdchecker("abcdefgh");
        pwdchecker pc3 = new pwdchecker("abcdefghijkl");

        System.out.println(pc1.getStrength());
        System.out.println(pc2.getStrength());
        System.out.println(pc3.getStrength());
    }
}