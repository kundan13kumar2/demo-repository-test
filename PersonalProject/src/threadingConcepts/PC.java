package threadingConcepts;

import java.util.LinkedList;

public class PC {
	private LinkedList<Integer> buffer=new LinkedList<Integer>();
	int capacity=2;
	public void producer() throws InterruptedException{
		int value=0;
		while(true){
			synchronized (this) {
				while(buffer.size()==capacity)
					wait();
				System.out.println("Produced Value : "+value);
				buffer.add(value++);
				notify();
				Thread.sleep(2000);
			}
		}
	}
	
	public void consumer() throws InterruptedException{
		while(true)
		{
			synchronized (this) {
				while(buffer.size()==0)
					wait();
				int val=buffer.removeFirst();
				System.out.println("Consumed Value : "+val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}
