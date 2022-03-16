import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapInsideHashMap {

	public static void main(String[] args) {
		
		Map<String, Map<Integer,String> > outer = new TreeMap<>();
		Map<Integer,String> inner1 = new HashMap<>();
		Map<Integer,String> inner2 = new HashMap<>();
		Map<String, Map<Integer,String> > temp = new TreeMap<>();
		
		inner1.put(1,"om");
		inner1.put(2,"ravi");
		
		inner2.put(3,"aa");
		inner2.put(4,"bb");
		
		outer.put("group1",inner1);
		outer.put("group2",inner2);
		
		for (Map.Entry<String, Map<Integer, String>> myEntry : outer.entrySet()) {
			//Map<Integer, String> entryVal = myEntry.getValue();
		//	String namevalue = entryVal.get(4);
		//	System.out.println(namevalue);
		
			System.out.println("key:-"+myEntry.getKey()+ " "+ "value:- "+myEntry.getValue());
			System.out.println("-----------------");
			temp.put(myEntry.getKey(), myEntry.getValue());
		}
		for (Map.Entry<String, Map<Integer, String>> myEntry1 : temp.entrySet()) {
			System.out.println("key1:-"+myEntry1.getKey()+ " "+ "value1:- "+myEntry1.getValue());
		}
		HashMap h = (HashMap) outer.get("group1");
		String name1 = (String) h.get(1);
		String name2 = (String) h.get(2);
		System.out.println("Name1:- "+name1);
		System.out.println("Name2:- "+name2);
		
	}

}
