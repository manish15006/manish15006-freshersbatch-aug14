package JUnitAssignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class program2Test {

		@Test
		void test() throws InvalidException {
			program2 obj = new program2();
			int [] check = new int[] {56,34,7,3,54,3,34,34,53};
			@SuppressWarnings("static-access")
			MinMax n = obj.findMinMax(check);
			assertEquals(56, n.getMax());
			assertEquals(3, n.getMin());
		}

}
