package ExceptionStudyThread;

public class PetersonThread {
	private int[] flag=new int[2];
	private int turn;
	public int ans;
	
	public PetersonThread()
	{
		flag[0]=flag[1]=1;
		turn=0;
		ans=0;
	}
	public void lock(int self)
	{
		//System.out.println("Saying itself to acquire the lock"); 
		flag[self]=1; 
	//	System.out.println("Giving the chance to other to acquire the lock");
		turn=1-self; 
	//	System.out.println(" Wait until the other thread looses the acquired lock.");
		while(flag[1-self]==1 && turn==1-self);	 
	}
	public void unlock(int self)
	{
	//	System.out.println("This will allow the other thread to acquire the lock");
		flag[self]=0;
	}
	
	public void fun(int self)
	{
		//while(true){
		lock(self);
		
		for(int i=0;i<2;i++){
			
			++ans;
			System.out.println("Entered thread : "+self+" Value of ans : "+ans);
		}
		
		unlock(self);

		//}
	}
}
