package ExceptionStudyThread;

public class MyThread1 extends Thread {
	Table t;
	public MyThread1(Table t) {
		this.t=t;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		Table.printTable("Thread1",1);
		t.printT("Thread First", 1);
	}
}
