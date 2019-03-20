package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;
public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList();
		for(String element:collection1)
		{
			for(List<String> element1:collection2)
			{
				for(String element2:element1)
				{
					if(element.equals(element2))
					result.add(element);
				}
			}
		}
        return result;
    }
}
