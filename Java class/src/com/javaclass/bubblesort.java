package com.javaclass;

public class bubblesort {
	public static void main(String []args) {
		int num[]= {7,5,6,9,2};
		int i,j,k,t;
		for(i=0;i<5;i++) {
			for(j=0;j<4-i;j++) {
				
				/*for(k=0;k<5;k++) {
					System.out.print(num[k]+"\t");
					
					
				}
			System.out.println();
			*/
				if (num[j]>num[j+1]) {
					t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
			}
		}

		for(k=0;k<5;k++) {
			System.out.print(num[k]+"\t");
			
		}
		
	
}
}
