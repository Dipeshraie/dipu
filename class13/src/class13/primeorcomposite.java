package class13;

import java.util.Scanner;

public class primeorcomposite {
public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		if(isprime(n)) {
			System.out.println("prime:");
			
		}
		else {
			System.out.println("Composite:");
		}
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

