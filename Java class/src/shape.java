
public class shape{
	public static void main(String[] args) {
		int i,j;
		System.out.println("triangle2");
		for(i=1;i<=5;i++) {
			for(j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("triangle3");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
			
	}
		System.out.println("triangle4");
		for(i=1;i<=5;i++) {
			for(j=1;j<i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=6-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
			}
		System.out.println("Diamond");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			for(j=1;j<i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
			}
		
	}
	}
	

	
	
			
			
		


