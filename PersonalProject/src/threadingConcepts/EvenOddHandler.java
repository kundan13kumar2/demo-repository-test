package threadingConcepts;

public class EvenOddHandler implements Runnable{
	private Printer printer;
	private int maxNumber;
	private Boolean isEven;
	public EvenOddHandler(Printer printer, int maxNumber, Boolean isEven) {
		super();
		this.printer = printer;
		this.maxNumber = maxNumber;
		this.isEven = isEven;
	}
	@Override
	public void run() {
		int number=isEven==true?2:1;
		while(number<=maxNumber){
			if(isEven)
				printer.printEven(number);
			else
				printer.printOdd(number);
			number+=2;
		}
	}
}
