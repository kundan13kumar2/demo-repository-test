package basic;

public class A{
		static int a=m1();
		static{
			System.out.println("In a");
		}
		static int m1(){
			
			System.out.println("IN static m1");
			return 20;
		}
		public static void main(String[] args) {
			System.out.println("Value of a : "+a);
			System.out.println("From m");
		}
}
