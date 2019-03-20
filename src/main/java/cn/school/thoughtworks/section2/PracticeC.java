package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> mm = new HashMap<String,Integer>();
		for(String element1:collection1)
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
				Integer leng = element1.length();
				str=String.valueOf(element1.charAt(0));
			    if(element1.contains("-")||element1.contains(":"))					
					count = Integer.parseInt(element1.substring(2,leng));//charAt(2)));
				if(element1.contains("["))
					count = Integer.parseInt(element1.substring(2,leng-1));
			}
			if(mm.containsKey(str))
				mm.put(str,mm.get(str).intValue()+count);		
			else
				mm.put(str,new Integer(count));
		}
        return mm;
    }
}
