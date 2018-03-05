package basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
		ReentrantLock re=new ReentrantLock();
		Runnable r1=new Worker(re, "T1");
		Runnable r2=new Worker(re, "T2");
		Runnable r3=new Worker(re, "T3");
		Runnable r4=new Worker(re, "T4");
		Runnable r5=new Worker(re, "T5");
		
		ExecutorService pool=Executors.newFixedThreadPool(5);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
	}
}
