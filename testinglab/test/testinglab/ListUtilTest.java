package testinglab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {

	@Test
	public void testNoElement() {
		List<String> list = new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}

	@Test
	public void testDuplicatedElement() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("b");
		assertEquals(3, ListUtil.countUnique(list));
	}

	@Test(expected = NullPointerException.class)
	public void testImpossibleCase() {
		List<String> list = null;
		ListUtil.countUnique(list);
	}

	@Test
	public void testExtremeCase() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			list.add("a");
		}
		assertEquals(1, ListUtil.countUnique(list));
	}

}
