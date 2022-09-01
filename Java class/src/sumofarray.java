import java.util.Scanner;

public class sumofarray {
	public static void main(String[]args) {
		int[] num = {11,12,33,54,76,100};
		int i,sum;
		sum=0;
//		Scanner sc = new Scanner(System.in);
		for(i=0;i<6;i++) {
			sum+=num[i];
			
		}
		System.out.println("sum is:"+sum);
	}
}
