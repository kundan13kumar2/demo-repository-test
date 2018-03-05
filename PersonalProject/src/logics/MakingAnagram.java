package logics;

import java.util.Scanner;

public class MakingAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int str1Freq[]=new int[26];
		int str2Freq[]=new int[26];
		for(int i=0;i<str1.length();i++)
			str1Freq[str1.charAt(i)-97]++;
		
		for(int i=0;i<str2.length();i++)
			str2Freq[str2.charAt(i)-97]++;
		int counter=0;
		for(int i=0;i<26;i++)
		{
			counter+=Math.abs(str1Freq[i]-str2Freq[i]);
		}
		System.out.println(counter);
		sc.close();
	}

}
