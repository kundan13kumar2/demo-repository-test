package ExceptionStudyThread;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		Random generator=new Random();
		Integer randomNumber=generator.nextInt(5);
		Thread.sleep(randomNumber*1000);
		return randomNumber;
	}

}
