package logics;

import java.util.Scanner;

public class ValidString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char charArray[]=str.toCharArray();
		int arr[]=new int[26];
		for(int i=0;i< str.length();i++)
			arr[charArray[i]-97]++;
		int i=0;
		while(arr[i]==0){
			i++;
		}
		int freq=arr[i];
		boolean flag=false;
		int counter=0;
		for(;i<26;i++){
			if(arr[i]!=0){
				if((freq!=arr[i])&& (Math.abs(freq-arr[i])>1)){
					flag=true;
					break;
				}
				if(Math.abs(freq-arr[i])==1){
					counter++;
					if(counter>1){
						flag=true;
						break;
					}
				}
			}
			
		}
		if(flag)
			System.out.println("NO");
		else
			System.out.println("YES");
		sc.close();
	}
}