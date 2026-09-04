import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,reverseNumber=0;
		System.out.println("enter number: ");
		number=sc.nextInt();
		int origNumber=number;
		while(number>0) {
			int digit=number%10;
			reverseNumber=reverseNumber*10+digit;
			number=number/10;
		}
		
		if(origNumber==reverseNumber) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		sc.close();
	}

}