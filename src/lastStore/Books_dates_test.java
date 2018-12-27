package lastStore;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Books_dates_test {

	@Test
	void test() {
		
		Books_dates test = new Books_dates("paco","pepe","luis",23);
		assertEquals(test.getCategorie(),"paco");
		assertEquals(test.getName(),"pepe");
		assertEquals(test.getAuthor(),"luis");
		assertEquals(test.getPrice(), 23);
		
		
		
		fail("Not yet implemented");
	}

}
