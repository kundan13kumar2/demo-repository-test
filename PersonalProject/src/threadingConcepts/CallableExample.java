package threadingConcepts;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable{

	@Override
	public Object call() throws Exception {
		Random generator=new Random();
		Integer number=generator.nextInt(4);
		return number;
	} 
}
