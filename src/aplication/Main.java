package aplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int mat[][]=new int[m][n];
		for (int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.print("enter with the number: ");
		int number=sc.nextInt();
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if(number==mat[i][j]) {
					System.out.println("position= "+i+","+j+":");
					if (j > 0) {
						System.out.println("left ="+mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("up ="+mat[i-1][j]);
					}
					if (j < n-1) {
						System.out.println("right ="+mat[i][j+1]);
					}
					if (i < m-1) {
						System.out.println("down ="+mat[i+1][j]);
					}
				}
			}
		}
		
       sc.close();
	}

}
