import java.util.HashMap;
import java.util.Map;

public class ExampleofMap {
 public static void main(String[] args) {
	 Map<Integer, String> map=new HashMap();
	    map.put(1, "line");
	    map.put(2, "polyline");
	    map.put(3, "polygon");
	    map.put(4, "circle");
	    
	   System.out.println("Map>>>"+map);
	   System.out.println("Map>>>"+map.get(2));
	   
	   for( Map.Entry<Integer, String> entry : map.entrySet())
	   {
		   System.out.println(entry.getKey()+" "+entry.getValue());
	   }
}
}
