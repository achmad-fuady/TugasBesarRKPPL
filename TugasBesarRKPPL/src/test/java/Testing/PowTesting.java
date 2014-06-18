/**
 * Dibuat Oleh Rezza
 */
package Testing;

import org.testng.Assert;
import org.testng.annotations.*;

import Class.D;

/**
 * @author Rezza Kurniawan - (Erka)
 * class Testing
 */
public class PowTesting {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Pengujian Pow Testing Dimulai dengan memasukan 2 & 3, harus menghasilkan 8.0");
	}
	
	@Test(groups = { "Pow" })
	public void powtest() {
		D callD = new D();
		Assert.assertEquals(callD.pow(2, 3), 8.0,"Gagal");
	}
	
	@Test(groups = {"Pow"})
	public void DStringTest() {
		D callD = new D();
		Assert.assertEquals(callD.toString(), "Ini Adalah toString dari Class D Implement PowInterface");
	}
	
}
