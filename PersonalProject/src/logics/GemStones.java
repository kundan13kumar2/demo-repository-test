package logics;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=null;
		int[] arr=new int[26];
		for(int i=0;i<n;i++){
			str=sc.next();
			for(int j=0;j<str.length();j++){
				if((arr[str.charAt(j)-97])==i){
					arr[str.charAt(j)-97]=i+1;
				}
			}
		}
		int counter=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n)
				counter++;
		}
		System.out.println(counter);
		sc.close();
	}
}
