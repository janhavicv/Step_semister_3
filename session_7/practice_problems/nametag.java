class nametag {
    private final String firstName;
    private final String lastName;

    nametag(String name) {
        String[] parts = name.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }

    String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        nametag tag = new nametag("Maria Gomez");
        System.out.println("Nickname: " + tag.getNickname());
    }
}