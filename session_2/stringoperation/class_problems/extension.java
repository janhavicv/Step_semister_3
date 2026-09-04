import java.util.Scanner;
class extension {
    static void checkFileExtension(String filename) {
        if (filename.endsWith(".pdf")|| filename.endsWith(".PDF")) {
            System.out.println("Valid.");
        } 
        else if (filename.endsWith(".docx")) {
            System.out.println("valid.");
        } 
        else if (filename.endsWith(".zip")|| filename.endsWith(".ZIP")) {
            System.out.println("valid.");
        } 
        else {
            System.out.println("Unknown file type.");
        }
    }

    public static void main(String[] args) {
        extension ext = new extension();
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        checkFileExtension(filename);
    }
}