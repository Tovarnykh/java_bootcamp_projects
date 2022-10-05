package quidditch.models;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamTest {
	
	String[] chasers;
	int a;
	
	@BeforeEach void initialize() {
		chasers = new String[] {null, "Robert", "Katie"};
	}
	
	@Test
	void hasNullTest() {		
		assertTrue(Team.hasNull(chasers));
	}
	
	@Test
	void hasBlankTest() {
		System.out.println(Team.hasBlank(chasers));
		assertTrue(Team.hasBlank(chasers));
	}

}
