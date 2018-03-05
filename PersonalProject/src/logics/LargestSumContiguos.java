package logics;

import java.util.Arrays;
import java.util.Stack;

public class LargestSumContiguos {

	static boolean areElementsContiguous(int arr[], int n) {
		// Sort the array
		Arrays.sort(arr);

		// After sorting, check if
		// current element is either
		// same as previous or is
		// one more.
		for (int i = 1; i < n; i++){
			System.out.println("Value : "+(arr[i] - arr[i - 1]));
			if (arr[i] - arr[i - 1] > 1)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); int size=sc.nextInt(); int[]
		 * arr=new int[size]; for(int i=0;i<size;i++) arr[i]=sc.nextInt(); int
		 * maxSum=arr[0]; int sum=arr[0]; for(int i=0;i<size;i++) {
		 * System.out.println("Sum : "+(sum+arr[i])); sum=sum+arr[i];
		 * if(sum>maxSum) maxSum=sum;
		 * 
		 * else if(sum<0) sum=0; } System.out.println("Maximum Sum :- "+maxSum);
		 * 
		 * 
		 * for(int i=0;i<size ;i++) { sum=Math.max(arr[i], arr[i]+sum);
		 * maxSum=Math.max(sum, maxSum); } System.out.println("Maximum Sum : "
		 * +maxSum);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); String s = scan.nextLine();
		 * String[] arr=s.split("[- !,?._'@*{}()]");
		 * System.out.println(arr.length); for(int i=0;i<arr.length;i++)
		 * System.out.println(arr[i]);
		 * 
		 * scan.close();
		 */
		/*int arr[] = { 5, 2, 3, 6, 4, 4, 6, 6 };
		int n = arr.length;

		if (areElementsContiguous(arr, n))
			System.out.println("Yes");

		else
			System.out.println("No");*/
		
		Stack<Character> charStack=new Stack<Character>();
		String str=new String("((){})");
		char[] charArray=str.toCharArray();
		int flag=0;
		for(int i=0;i<str.length();i++){
			if(charArray[i]=='{' || charArray[i]=='(' || charArray[i]=='[')
				charStack.push(charArray[i]);
			else
			{
				if(charStack.isEmpty()){
					flag=1;
					break;
				}
				else
				{
					char ch=charStack.pop();
					if(!((ch=='{' && charArray[i]=='}') || (ch=='(' && charArray[i]==')') || (ch=='[' && charArray[i]==']')))
					{
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==1)
			System.out.println("Not Matched");
		else
			System.out.println("Matched");
	}

}
