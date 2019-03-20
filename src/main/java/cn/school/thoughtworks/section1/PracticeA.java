package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
		List<String> result = new ArrayList();
		for(String element1:collection1)
		{
			for(String element2:collection2)
			{
				if(element1.equals(element2))
					result.add(element1);
			}
		}
        return result;
    }
}
