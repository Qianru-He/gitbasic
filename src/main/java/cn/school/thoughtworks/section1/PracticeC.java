package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList();
		for(String element:collection1)
		{
			for(List<String> value:collection2.values())
			{
				for(String element2:value)
				{
					if(element.equals(element2))
						result.add(element);
				}
			}
		}
        return result;
    }
}
