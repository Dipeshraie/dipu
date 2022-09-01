package class13;

import java.util.Scanner;

public class powerfunction {
	public static void main(String[] args) {
		
		int i,p,b,res,num;
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		if(isprime(n)) {
			System.out.println("prime:");
			
		}
		else {
			System.out.println("Composite");
		}
		System.out.println("Enter the base  and a power: ");
		Scanner scc= new Scanner(System.in);
		b=sc.nextInt();
		p=sc.nextInt();
		res=power(b,p);
		System.out.println("Result:"+res);
		
		
	}

	private static int power(int b, int p) {
		int res=1;
		while(p!=0) {
			res*=b;
			p--;
		}
		return res;
	}
	static boolean isprime(int num) {
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
