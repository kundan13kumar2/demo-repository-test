package logics;

import java.util.Scanner;

//Partially Accepted

public class BomberGame {
	public static void main(String[] args) {
		int R, C, N;
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		N = sc.nextInt();
		char[][] table = new char[R][C];
		for (int i = 0; i < R; i++){
			String col=sc.next();
			char[] charArray=col.toCharArray();
			table[i] = charArray;
		}
		if(N==1){
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					System.out.print(table[i][j]);
				System.out.println();
			}
		}
		else if (N % 2 == 0) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					System.out.print('O');
				System.out.println();
			}
		} else {
			for(int i=3;i<=N;i+=2)
				modifyTable(table, R, C);
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					System.out.print(table[i][j]);
				System.out.println();
			}
		}
		sc.close();
	}

	private static void modifyTable(char[][] table, int r, int c) {
		char[][] tempTable=new char [r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++){
//				System.out.println("Value of i and j : "+i+" : "+j);
//				System.out.println("Value : "+table[i][j]);
				if((isSafe(table,i,j,r,c)=='O') || 
					(isSafe(table,i+1,j,r,c)=='O') ||
					(isSafe(table,i,j+1,r,c)=='O') || 
					(isSafe(table,i-1,j,r,c)=='O') || 
					(isSafe(table,i,j-1,r,c)=='O')){
					tempTable[i][j]='.';
				}
				else
					tempTable[i][j]='O';
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				table[i][j]=tempTable[i][j];
		}
	}
	private static char isSafe(char[][] table, int i, int j, int R, int C) {
		if (i >= 0 && i < R && j >= 0 && j < C){
			return table[i][j];
		}
		return '.';
	}

}
