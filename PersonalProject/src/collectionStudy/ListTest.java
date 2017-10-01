package collectionStudy;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		intList.forEach(name->System.out.println(name));	//Java 8 For Each
		
		
		List a=new ArrayList();
		a.add("kundan");
		a.add(1);
		a.forEach(name->System.out.println(name));
	}

}
