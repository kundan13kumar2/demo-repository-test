package basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable{
	String name;
	ReentrantLock re;
	public Worker(ReentrantLock re,String name){
		this.re=re;
		this.name=name;
	}
	
	public void lock(){
		
	}
	public void run(){
		boolean done=false;
		while(!done){
			boolean ans=re.tryLock();
			if(ans){
				try{
						Date d=new Date();
						SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
						System.out.println("Task : "+name+" Outer lock acquired at : "+ft.format(d)+" : doing inner work");
						System.out.println("Lock hold count : "+re.getHoldCount());
						Thread.sleep(1000);
				}
				catch(Exception e){
					System.err.println("Excepetion Occured : "+e.getMessage());
					
				}finally{
					System.out.println("Task name : "+name+" : relasing outer lock");
					re.unlock();
					System.out.println("Lock hold count : "+re.getHoldCount());
				}
			}
			else{
				System.out.println("Task name : "+name +" waiting for lock");
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.err.println("Exception Occured : "+e.getMessage());
				}
			}
		}
		
	}
}
