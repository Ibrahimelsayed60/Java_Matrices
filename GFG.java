package com.example;

import java.util.Arrays;

public class GFG {
	/* Ptinting the elements of Matix */
//	public static void print2D(int mat[][]){
//		for(int i=0;i<mat.length;i++){
//			for(int j=0;j<mat[i].length;j++)
//				System.out.print(mat[i][j]+" ");
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int mat[][]={{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}};
//		print2D(mat);
//		}
	
	/* Addition two matrices*/
	// Function to print Matrix
	static void printMatrix(int M[][],int rowSize,int colSize){
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<colSize;j++)
				System.out.print(M[i][j]+" ");
			System.out.println();
		}
	}
	// Function to add the two matrices
//	static int[][] add(int A[][],int B[][],int size){
//		int i,j;
//		int c[][] = new int[size][size];
//		for(i=0;i<size;i++){
//			for(j=0;j<size;j++)
//				c[i][j] = A[i][j]+B[i][j];
//		}
//		return c;
//	}
//	
//	public static void main(String[] args){
//		int size = 4;
//		int A[][]={{1,1,1,1},
//				{2,2,2,2},
//				{3,3,3,3},
//				{4,4,4,4}};
//		System.out.println("\nMatrix A:");
//		printMatrix(A,size,size);
//		
//		int B[][] = {{1,1,1,1},
//				{2,2,2,2},
//				{3,3,3,3},
//				{4,4,4,4}};
//		System.out.println("\nMatrix B:");
//		printMatrix(B,size,size);
//		
//		int c[][] = add(A,B,size);
//		System.out.println("\nMatrix C:");
//		printMatrix(c,size,size);
//		
//		}
	/* Checking the equality between two arrays */
//	public static void main(String[] args){
//		int a[] = {30,25,40};
//		int b[] = {30,25,40};
//		boolean result = Arrays.equals(a, b);
//		if(result == true)
//			System.out.println("Two arrays are equal");
//		else
//			System.out.println("Two arrays are not equal");
//	}
	
	/* Find the transpose for square Matrix */
	static final int N = 4;
	static void transpose(int A[][],int B[][]){
		int i,j;
		for(i=0;i<N;j++)
			for(j=0;j<N;j++)
				B[i][j] = A[i][j];
	}
	
	/*Find the transpose of Rectangular Matrix*/
	static final int M = 3;
	static final int N = 4;
	static void transpose(int A[][],int B[][]){
		int i,j;
		for(i=0;i<N;i++)
			for(j=0;j<M;j++)
				B[i][j] = A[j][i];
	}
	/* Find the transpose with In-place for square Matrix*/
	static void transpose(int A[][]){
		for(int i=0;i<N;i++)
			for(int j=i+1;j<N;j++){
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
	}
}
	



