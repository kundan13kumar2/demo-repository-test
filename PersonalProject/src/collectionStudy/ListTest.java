package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		/*Iterator<Integer> iterate = intListFirst.iterator();
		
		while(iterate.hasNext())
		{
			System.out.println("Value in first list :"+iterate.next());
			intListFirst.remove(2);
		}
		
		Iterator<Integer> var = intListSecond.iterator();*/
	
		List<Integer> intListFirst=new ArrayList<Integer>();

		intListFirst.add(1);
		intListFirst.add(2);
		intListFirst.add(3);
		intListFirst.add(4);
		
		List<Integer> intListSecond=new ArrayList<Integer>();
		
		intListSecond.add(1);
		intListSecond.add(2);
		intListSecond.add(6);
		intListSecond.add(4);
		
	
		ListIterator<Integer> var1 = intListSecond.listIterator();
		
	while(var1.hasNext())
	{
		var1.next();
	}
//			System.out.println("Value in second : "+var1.next());
		
		while(var1.hasPrevious())
			System.out.println("Value in second Previous : "+var1.previous());
		
		//fail fast
		//not fail fast
		
		
	/*	Vector<Integer> vec=new Vector<Integer>();
		
		
		Set<Integer> setInteger=new HashSet<Integer>();
		setInteger.add(2);
		setInteger.add(1);
		setInteger.add(3);*/
			
//		Iterator<Integer> var = setInteger.iterator();
		
	/*	for(Integer var:setInteger)
		{
			System.out.println();
		}*/
		/*while(var.hasNext())
		{
			System.out.println("Value in set : "+var.next());
		}*/
		//treeSet :- implements : navigeable set :-  
		//linkedhashset

	}

}
