package JUnitAssignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class savingsaccountTest {
	
	@Test
	void test1() throws Insufficientbalanceexception, Illegalbanktransactionexception {
		savingsaccount myaccount = new savingsaccount(1, 10000);
		assertThrows(Insufficientbalanceexception.class, ()-> myaccount.withdraw(100000));
	}

	@Test
	void test2() {
		savingsaccount myaccount = new savingsaccount(1, 10000);
		assertThrows(Illegalbanktransactionexception.class, ()-> myaccount.withdraw(-200));

	}
	
	@Test
	void test3() throws Insufficientbalanceexception, Illegalbanktransactionexception {
		savingsaccount myaccount = new savingsaccount(1, 10000);
		assertEquals(9500, myaccount.withdraw(500));
	}
	

}
