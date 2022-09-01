package class16;

public class methodoverloading {
	public static void main(String[] args) {
		int x=5,y=7,z=12;
		int sum1=add(x,y);
		int sum2=add(x,y,z);
		System.out.println("sum of number is"+sum1+"sum 2 is"+sum2);
	}

	private static int add(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	private static int add(int x, int y ) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
