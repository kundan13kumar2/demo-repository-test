package logics;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			boolean funny=true;
			String str=sc.next();
			for(int j=0;j<str.length()-1;j++){
				int difference = Math.abs(str.charAt(j)-str.charAt((j+1)));
				int reverseDifference=Math.abs(str.charAt(str.length()-1-j)-(str.charAt(str.length()-1-(j+1))));
				if(difference!=reverseDifference)
				{
					funny=false;
					break;
				}
			}
			if(funny){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
		}
		sc.close();
	}
}
