/**
 * Dibuat Oleh Mardiansyah Danar
 */
package Testing;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Class.A;


/**
 * @author (mardiansyaah)
 *
 */
public class ATest {
		
		@BeforeClass
		public void setUp() {
			System.out.println("Pengujian Kelas A metod add dengan memasukan 10 & 5, harus menghasilkan 15");
			System.out.println("Pengujian Kelas A metod sub dengan memasukan 20 & 5, harus menghasilkan 25 maka dianggap benar");

		}
		
		@Test(groups = { "ATest" })
		public void addtest() {
			A callD = new A();
			Assert.assertEquals(callD.add(10, 5), 15,"Salah");
		}
		
		@Test(groups = { "ATest" })
		public void subTest() {
			A callD = new A();
			Assert.assertNotEquals(callD.sub(20, 5), 25,"Benar");
		}
		
	
}
