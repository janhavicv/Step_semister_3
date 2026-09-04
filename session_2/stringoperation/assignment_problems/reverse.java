class reverse{
    void reverseeachword(String str){
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }
        System.out.println(reversedString.toString().trim());
    }
    public static void main(String[] args) {
        reverse r = new reverse();
        String str = "Hello club";
        r.reverseeachword(str);
    }
}
