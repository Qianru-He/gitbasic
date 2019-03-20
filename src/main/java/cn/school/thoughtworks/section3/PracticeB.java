package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
		for(List<String> value:object.values())
	    {
		   for(String element:value)
		   {
			   if(collectionA.containsKey(element))
			   {
				   Integer count = collectionA.get(element).intValue();
				   count = count-count/3;
				   collectionA.put(element,count);
				}
		   }
	    }
        return collectionA;
    }
}
