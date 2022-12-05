import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeTest {

	// Create an instance of the Prime class that will be used to access the isPrime() method.
	Prime p = new Prime();

	// test cases
	@Test
	public void test2() {
		assertTrue(p.isPrime(2));
	}

	@Test
	public void test3() {
		assertTrue(p.isPrime(3));
	}

	@Test
	public void test4() {
		assertTrue(p.isPrime(4));
	}

	@Test
	public void test5() {
		assertTrue(p.isPrime(5));
	}

	@Test
	public void test6() {
		assertTrue(p.isPrime(6));
	}

	@Test
	public void test7() {
		assertTrue(p.isPrime(7));
	}
}