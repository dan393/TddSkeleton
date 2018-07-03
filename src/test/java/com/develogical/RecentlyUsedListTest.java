package com.develogical;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class RecentlyUsedListTest {

	@Test
	public void listIsEmptyWhenInitialized() {
	    assertTrue(new RecentlyUsedList().isEmpty());
	}

	@Test
	public void checkNewElementHasBeenAdded(){
        RecentlyUsedList newList = new RecentlyUsedList();

        newList.add("abc");
        assertTrue(newList.contains("abc"));

    }

    @Test
    public void retrieveItemFromList() {
	    RecentlyUsedList testList = new RecentlyUsedList();

        String testItem = "testElement";
        testList.add(testItem);
        assertThat(testList.get(0), equalTo(testItem));
        assertTrue(testList.get(0).equals(testItem));
//        assertTrue(testList.isEmpty() == false);
//        assertTrue(testList.getMostRecentItem().equals(testItem));
    }

    @Test
    public void getMostRecentItemFromList() {
        RecentlyUsedList testList = new RecentlyUsedList();

        String testItem = "testElement";
        String testItem2 = "testElement2";
        testList.add(testItem);
        testList.add(testItem2);

        assertTrue(testList.get(0).equals(testItem2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void throwExceptionIfNull() {
        RecentlyUsedList testList = new RecentlyUsedList();
        testList.add(null);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundIfIndexOutOfBound(){
        RecentlyUsedList testList = new RecentlyUsedList();
        testList.get(0);
    }

    @Test
    public void duplicateItemIsMovedToFrontNotRemoved() {
        RecentlyUsedList testList = new RecentlyUsedList();

        String testItem1 = "testElement";
        String testItem2 = "testElement2";
        String testItem3 = "testElement3";
        String testItem4 = "testElement4";
        testList.add(testItem1);
        testList.add(testItem2);
        testList.add(testItem3);
        testList.add(testItem4);
        testList.add(testItem2);

        assertTrue(testList.get(0).equals(testItem2));
        assertTrue(testList.size() == 4);
    }

}
