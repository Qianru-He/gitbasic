package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
		Map<String,Integer> mm = new HashMap<String,Integer>();
		for(String element1:collectionA)
		{
			String str;
			Integer count = 0;
			if(element1.length()==1)
			{
				str= element1;
				count=1;
			}
			else
			{
				str=String.valueOf(element1.charAt(0));
				count = Integer.parseInt(String.valueOf(element1.charAt(2)));
			}
			if(mm.containsKey(str))
				mm.put(str,mm.get(str).intValue()+count);		
			else
				mm.put(str,new Integer(count));
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
