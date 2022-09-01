
public class JavaMethodsExample {
	public static void main(String[] args) {
		int a=5,b=7;
		int res;
		res=add(a,b);
		System.out.println("sum"+res);
		diff(a,b);
		float pi=pi();
		System.out.println("pi:"+pi);
		greet();
	}

	 static void greet() {
		// TODO Auto-generated method stub
		System.out.println("hello good afternoon");
	}

	 static float pi() {
		// TODO Auto-generated method stub
		return 3.144567f;
		
	}

	 static void diff(int a, int b) {
		// TODO Auto-generated method stub
		int d;
		if(a>b) {
			d=a-b;
		}
		else {
			d=b-a;
		}
		System.out.println("difference is:"+d);
		
		
		
	}

	 static int add(int a, int b) {
		// TODO Auto-generated method 
		int c=a+b;
		return c;
	}
	

}
