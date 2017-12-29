package threadingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask[] futureTasks=new FutureTask[5];
		
		for(int i=0;i<5;i++){
			Callable callable=new CallableExample();
			futureTasks[i]=new FutureTask(callable);
			Thread t=new Thread(futureTasks[i]);
			t.start();
		}
		
		for(int i=0;i<5;i++)
			System.out.println("Values : "+futureTasks[i].get());
	}
}
