package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> mm = new HashMap<String,Integer>();
		for(String element1:collection1)
		{
			String str = element1;
			if(mm.containsKey(str))
				mm.put(str,mm.get(str).intValue()+1);		
			else
				mm.put(str,new Integer(1));
		}
        return mm;
    }
}
