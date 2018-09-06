package testinglab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Napasai Sutthichutipong
 *
 */
public class ListUtil {

	/**
	 * Count the number of distinct elements in a list. The list may be empty but
	 * not null. TODO: can the list contain null values? Does null count as a unique
	 * element?
	 *
	 * @param list
	 *            a list of elements
	 * @return the number of distinct elements in list
	 */
	public static int countUnique(List<?> list) {
		List<Object> tempList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (tempList.indexOf(list.get(i)) == -1) {
				tempList.add(list.get(i));
			}
		}
		return tempList.size();
	}
	
}
