package JUnitAssignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class program4Test {

	@BeforeAll
	static void beforeall() {
		System.out.println("This print's First ....BeforeAll..");
	}
	
	@AfterAll
	static void afteralll() {
		System.out.println("it prints after each and every testcase.....AfterAll..");
	}
	
	
	@Before
	void before() {
		System.out.println("It run's before every testcase @Test");
	}
	
	@Ignore
	void itignores() {
		System.out.println("not print as it is ignored");
	}
	
	@Test
	void test() {
		System.out.println("testcase 1...@test");
	}
	
	@Test
	void test1() {
		program4 obj = new program4();
		int a = obj.mul(5, 2);
		assertEquals(10,a);
		System.out.println("Multiply Testcase passed");
				
	}

}
