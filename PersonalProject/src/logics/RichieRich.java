package logics;

import java.util.Scanner;

public class RichieRich {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		String str=sc.next();
		char[] charArray=str.toCharArray();
		/*for(int i=0;i<n;i++)
			charArray[i]=sc.next().charAt(0);*/
		int changer=0;
		int i=0,j=charArray.length-1;
		while(i<=j){
			if(charArray[i]!=charArray[j]){
				charArray[i]=charArray[j]='9';
				changer++;
				if(changer>k)
					break;
			}
			i++;
			j--;
		}
		if(changer>k)
			System.out.println("-1");
		else
			System.out.println(new String(charArray));
		sc.close();
	}

}
