package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
       
	   for(List<String> value:object.values())
	   {
		   for(String element:value)
		   {
			   if(collectionA.containsKey(element))
					collectionA.put(element,collectionA.get(element).intValue()-1);
		   }
	   }

        return collectionA;
    }
}
