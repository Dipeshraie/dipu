package com.javaclass;

public class twodarray {
	public static void main(String[] args) {
		int[][]num= { {1,2,3},{4,5,6},{7,8,9}};
		int[][][]arr3d={ {{1,2,3},{4,5,6},{7,8,9}},{ {1,2,3},{4,5,6},{7,8,9}},{ {1,2,3},{4,5,6},{7,8,9}}};
		int i,j,k;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
