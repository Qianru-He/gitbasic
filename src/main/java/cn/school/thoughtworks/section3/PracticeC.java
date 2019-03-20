package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> mm = new HashMap<String,Integer>();
		for(String element1:collectionA)
		{
			if(mm.containsKey(element1))
				mm.put(element1,mm.get(element1).intValue()+1);		
			else
				mm.put(element1,new Integer(1));
		}
		for(List<String> value:object.values())
	    {
			for(String element:value)
			{
				if(mm.containsKey(element))
				{
					Integer count = mm.get(element).intValue();
					count = count-count/3;
					mm.put(element,count);
				}
			}
		}
        return mm;
    }
}
