package collectionStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer,String> dsMap=new HashMap<Integer,String>();
		
		dsMap.put(1, "C");
		dsMap.put(2, "C++");
		dsMap.put(2, "Java");
		dsMap.put(4, "Python");
		
		for(Entry<Integer, String> var:dsMap.entrySet())
		{
			System.out.println("Key : "+var.getKey()+" : Values : "+var.getValue());
		}
		
		
	}

}
