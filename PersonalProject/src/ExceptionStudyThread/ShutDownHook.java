package ExceptionStudyThread;

public class ShutDownHook {

	public static void main(String[] args) {

			Runtime.getRuntime().addShutdownHook(new Thread()
			{
				public void run(){
					System.out.println("Shutdown hook is running!!");
				}
			});
			System.out.println("Application Terminatting...");
			System.out.println("Total Memory 1: "+Runtime.getRuntime().totalMemory());
			System.out.println("Total Memory 2: "+Runtime.getRuntime().freeMemory());
			System.out.println("Total Memory 3: "+Runtime.getRuntime().maxMemory());
	}
}
