package logics;

import java.util.Scanner;

public class AlmostSorted {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		if(isAsc(arr, n))
		{
			System.out.println("yes");
			return;
		}
		int l,r;
		for(l=0;l<n-1 && arr[l]<arr[l+1];l++);
		for(r=n-1;r>0 && arr[r]>arr[r-1];r--);
		swap(arr,l,r);
		if(isAsc(arr, n))
		{
			System.out.println("yes");
			System.out.println("swap "+(l+1)+" "+(r+1));
			return;
		}
		int i=l+1;
		int j=r-1;
		while(i<j){
			swap(arr,i,j);
			i++;j--;
		}
		if(isAsc(arr, n)){
			System.out.println("yes");
			System.out.println("reverse "+(l+1)+" "+(r+1));
			return;
		}
		System.out.println("no");
		sc.close();
		
	}
	private static boolean isAsc(int[] arr,int n)
	{
		for(int i=0;i<n-1;i++)
			if(arr[i]>arr[i+1])
				return false;
		return true;
	}
	
	private static void swap(int[] arr,int l,int r){
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
}
