package Testing;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Class.C;

public class CTest {
  /**
   * @author Achmad Fuady
   */
	@BeforeClass
	public void setUp() {
		System.out.println("Pengujian Class E");
	}
	
	@Test(groups = { "C" })
	public void addTest() {
		C c = new C();
		Assert.assertEquals(c.add(), 6);
	}
	@Test(groups = { "C" })
	public void subTest() {
		C c = new C();
		Assert.assertEquals(c.sub(), 2);
	}
	
	@Test(groups = { "C" })
	public void mulTest() {
		C c = new C();
		Assert.assertEquals(c.mul(), 8.0);
	}
	@Test(groups = { "C" })
	public void divTest() {
		C c = new C();
		Assert.assertEquals(c.div(), 2.0);
	}
	
	@Test(groups = { "C" })
	public void modTest() {
		C c = new C();
		Assert.assertEquals(c.mod(4,2), 0);
	}
	@Test(groups = { "C" })
	public void sqrtTest() {
		C c = new C();
		Assert.assertEquals(c.sqrt(8), 2.8284271247461903);
	}
}
