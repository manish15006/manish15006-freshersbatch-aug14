package JUnitAssignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	@BeforeEach
	void beforeAnything() {
		System.out.println("before each @Test");
	}
	@Test
	void test1() throws InvalidException {
		//fail("Not yet implemented");
		int [] check = new int[] {56,34,7,3,54,3,34,34,53};
		int [] arr = MinMaxFinder.findminmax(check);
		int [] exp = new int[] {3,56};
		assertArrayEquals(exp, arr);		
		System.out.println(arr[0]+" "+arr[1]);	
	}
	@Test
	public void test2(){
		int [] check2 = new int[] {};
		assertThrows(NullPointerException.class, ()->MinMaxFinder.findminmax(check2));
		
	}
	
	@Test
	public void test3() {
		int [] check3 = new int[] {1};
		assertThrows(InvalidException.class, ()->MinMaxFinder.findminmax(check3));
		
	}
	
	

}
