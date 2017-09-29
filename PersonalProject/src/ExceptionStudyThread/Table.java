package ExceptionStudyThread;

public class Table{  
	 synchronized static void printTable(String thName,int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(thName+" : " +n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	 synchronized  void printT(String thName,int n){  
		   for(int i=1;i<=10;i++){  
		     System.out.println(thName+"  : " +n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   }  
		 }  
	}  
