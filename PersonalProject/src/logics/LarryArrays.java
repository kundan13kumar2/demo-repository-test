package logics;

import java.util.Scanner;

public class LarryArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int k;
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			k=sc.nextInt();
			int[] arr=new int[k];
			for(int j=0;j<k;j++)
				arr[j]=sc.nextInt();
			
			int swapCount=countSwapInInsertionOrder(arr,k);
			if(swapCount%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	private static int countSwapInInsertionOrder(int[] arr,int n){
		int counter=0;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j=j-1;
				counter++;
			}
			arr[j+1]=temp;
		}
		return counter;
	}

}
