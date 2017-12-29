package reflectionExample;
public class RefTest {
	private String s;
    public RefTest()  {  s = "GeeksforGeeks"; }
    public void method1()  {
        System.out.println("The string is " + s);
    }
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }
    private void method3() {
        System.out.println("Private method invoked");
    }
}
