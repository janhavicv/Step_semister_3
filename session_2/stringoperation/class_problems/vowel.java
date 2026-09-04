import java.util.Scanner;
public class vowel{
    void countvowelandconsonant(String s){
        Scanner sc=new Scanner(System.in);
        int vcount=0;
        int ccount=0;
        for(int i=0;i<s.length();i++){
            s.charAt(i);
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.print("Vowels: " + vcount);
        System.out.println("|Consonants: " + ccount);
    }
    public static void main(String[] args){
        vowel v=new vowel();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        v.countvowelandconsonant(s);
    }
}
