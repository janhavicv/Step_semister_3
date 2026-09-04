
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int number,orignumber,sum=0;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		orignumber=number;
		while(number>0) {
			int digit=number%10;
			sum=sum+digit*digit*digit;
			number=number/10;
		}
		if(orignumber==sum) {
			System.out.println("the number is armstrong number");
		}
		else {
			System.out.println("The number is not armstrong number");
		}
		sc.close();}
}
	
