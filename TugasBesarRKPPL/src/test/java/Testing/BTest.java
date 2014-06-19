/**
 * Dibuat Oleh Mardiansyah Danar
 */
package Testing;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Class.B;

/**
 * @author (mardiansyaah)
 *
 */
public class BTest {
	@BeforeClass
	public void setUp() {
		System.out.println("Pengujian Kelas B metod mul dengan memasukan 10 & 5, harus menghasilkan 150");
		System.out.println("Pengujian Kelas B metod div dengan memasukan 20 & 5, harus menghasilkan 4 maka dianggap benar");

	}
	
	@Test(groups = { "BTest" })
	public void mulTest() {
		B callD = new B();
		Assert.assertEquals(callD.mul(10, 5), 150.0,"Salah");
	}
	
	@Test(groups = { "BTest" })
	public void divTest() {
		B callD = new B();
		Assert.assertNotEquals(callD.div(20, 5), 4,"Benar");
	}
}
