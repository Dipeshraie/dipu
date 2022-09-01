package class11;
import java.util.ArrayList;
public class arraylistexample {
	public static void main(String[] args) {
		ArrayList<Integer>num= new ArrayList <Integer>();
		int i;
		num.add(123);
		num.add(456);
		num.add(654);
		num.add(011);
		num.add(123);
		for(i=0;i<5;i++) {
			System.out.println(num.get(i));
			
		}
		
	}
	

}

