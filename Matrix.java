package chapter6;

import java.util.Scanner;

public class Matrix {
private int[][] matrix;
	
	public Matrix(){
		System.out.println("1 for generated\n2 for manual");
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		System.out.print("Number of rows: ");
		int r=sc.nextInt();
		while(r>10){
			System.out.print("ERROR\nNumber of rows: ");
			r=sc.nextInt();
		}
		System.out.print("Number of columns: ");
		int c = sc.nextInt();
		while(c>10){
			System.out.print("ERROR\nNumber of columns: ");
			r=sc.nextInt();
		}
		matrix = new int[r][c];
		if(choice==1){
			
			for(int i=0; i< r;i++){
				for(int j=0;j<c;j++){
					matrix[i][j]=(int)(Math.random()*9+1);
				}
			}
		}
		else{
			for(int i=0; i< r;i++){
				for(int j=0;j<c;j++){
					System.out.print("Enter index for ["+i+"]["+j+"]: ");
					int index = sc.nextInt();
					matrix[i][j]=index;
				}
			} 
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int[][]getMatrix(){
		return matrix;
	}

}


