package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import org.w3c.dom.ls.LSInput;

public class Test {
		
	public static void main(String[] args) {
		
		List<String> listSlots = new ArrayList<String>();
		
		listSlots.add("1");
		listSlots.add("14-Jun-2021");
		listSlots.add("3:30 PM");
		listSlots.add("4:00 PM");
		
		
		//Map<List<String>, String> avl = new HashMap<List<String>, String>();
		
		
		for(String book : listSlots)
		{
			if(listSlots.contains("3:30 PM"))
			{
				listSlots.remove(listSlots.get(3));
			}
		}
		
		
	}
}
