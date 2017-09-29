package ExceptionStudyThread;

public class MyThread2 extends Thread {
	Table t;
	public MyThread2(Table t) {
		this.t=t;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		t.printT("Thread Second", 10);
		Table.printTable("Thread2",10);
	}
}