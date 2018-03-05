package logics;

import java.util.Scanner;

public class SeparateNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String str=sc.next();
			long firstx=-1;
			boolean valid=false;
			for(int j=1;j<=str.length()/2;j++){
				long x=Long.parseLong(str.substring(0, j));
				firstx=x;
				String test=Long.toString(x);
				while(test.length()<str.length()){
					test+=Long.toString(++x);
				}
				if(test.equals(str)){
					valid=true;
					break;
				}
			}
			if(valid)
				System.out.println("YES "+firstx);
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
