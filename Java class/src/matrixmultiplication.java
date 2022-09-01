import java.util.Scanner;
public class matrixmultiplication {
	public static void main(String[]args) {
		int[] num = {11,12,13,14,15};
		int[] arr =new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println(num[4]);
		System.out.println("Enter the five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
			System.out.print(arr[2]+"\t");
		}
		int marks[] = new int[13];
		int a=12, b=23,c=34, d=45, e=444,g=5644;
		System.out.println(d);
		for(i=0;i<13;i++) {
			System.out.println(" Enter the marks of "+(i+1)+" th student");
			marks[i]=sc.nextInt();
		}
		for(i=0;i<13;i++) {
			System.out.println(" marks obtained by "+(i+1)+" th student"+marks[i]);
			
		}
		
		
	}

}
