package recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionExample1Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test10001() {
		List<String> input = new ArrayList();
		input.add("1");
		input.add("22");
		input.add("333");
		input.add("4444");
		input.add("55555");
		input.add("666666");
		input.add("7777777");
		input.add("88888888");
		
		RecursionExample1 re = new RecursionExample1();
		
		re.getLongest(input);
		
		
		
	}

}
