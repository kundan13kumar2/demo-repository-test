package collectionStudy;

public class GCCallExample {
	static GCCallExample test;
	static int count=0;
	public static void main(String[] args) throws InterruptedException {

		GCCallExample t=new GCCallExample();
		t=null;
		System.gc();
		Thread.sleep(1000);
		test=null;
		System.gc();
		System.out.println("Finalize called : "+count);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized method called: "+count);
		count++;
		test=this;
	}
	

}
