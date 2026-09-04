import java.util.Scanner;
public class Primecheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int no=sc.nextInt();
		boolean isprime= true;
		if(no<2) {
			isprime=false;
		}
		else {
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					isprime=false;
					break;
				}
			}
			System.out.print("The number "+no+" is "+isprime+" that is not a prime number");
		}
		sc.close();
	}

}
