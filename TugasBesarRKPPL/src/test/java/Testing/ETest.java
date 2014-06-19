/**
 * Dibuat Oleh Rezza
 */
package Testing;

import java.awt.List;

import org.testng.Assert;
import org.testng.annotations.*;

import Class.E;

/**
 * @author Rezza Kurniawan - (Erka)
 * Class Testing
 */
public class ETest {

	@BeforeClass
	public void setUp() {
		System.out.println("Pengujian Class E");
	}
	
	@Test(groups = { "ETest" })
	public void containsTest() {
		E callE = new E();
		Assert.assertEquals(callE.contains("napoleon"), true);
	}
	
	@Test(groups = { "ETest" })
	public void ListTest() {
		E callE = new E();
		
		List actual = new List();
		actual.add("List 1");
		actual.add("List 2");
		callE.setDataList(actual);
		
		Assert.assertSame(callE.getDataList().getItemCount(), 2);
	}
	
}
