/**
 * Dibuat Oleh Rezza
 */
package Class;

import Interface.AddAndSubInterface;

/**
 * @author Rezza Kurniawan - (mardiansyah)
 *
 */
public class A implements AddAndSubInterface{

	
	public A() {
	       System.out.println("Ctor kelas A");
	 }

	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "toString kelas B";
	}

	/* (non-Javadoc)
	 * @see Interface.AddAndSubInterface#add(int, int)
	 */
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see Interface.AddAndSubInterface#sub(int, int)
	 */
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
