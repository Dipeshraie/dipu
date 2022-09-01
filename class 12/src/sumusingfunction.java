import java.util.Scanner;

public class sumusingfunction {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int n=new Scanner (System.in).nextInt();
		int yes=sum(n);
		int res=fact(n);
		 System.out.println("the factorial of"+n+"  number is:"+res);
		System.out.println("the sum of natural number is:"+yes);
		
	}

	private static int fact(int n) {
		int res=1;
		while(n!=1) {
			res*=n;
			n--;
		}
		return res;
	}

	private static int sum(int n) {
		int yes=0;
		while(n!=0) {
			yes+=n;
			n--;
		}
		return yes;
	}
	
	
	

}
