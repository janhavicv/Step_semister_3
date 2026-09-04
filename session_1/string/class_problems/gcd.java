import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		int num1,num2,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		num2=sc.nextInt();
		while(num2!=0) {
			rem=num1%num2;
			num1=num2;
			num2=rem;
			
		}
		System.out.println("The gcd of the numbers is "+num1);
		sc.close();
	}

}