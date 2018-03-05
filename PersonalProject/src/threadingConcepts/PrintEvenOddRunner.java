package threadingConcepts;

public class PrintEvenOddRunner {
	public static void main(String[] args) {
		Printer printer=new Printer();
		Thread t1=new Thread(new EvenOddHandler(printer,10,false));
		Thread t2=new Thread(new EvenOddHandler(printer,10,true));
		t1.start();
		t2.start();
	}
}
