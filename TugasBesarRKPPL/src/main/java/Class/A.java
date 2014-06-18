/**
 * Dibuat Oleh Mardiansyah Danar
 */
package Class;

import Interface.AddAndSubInterface;


/**
 * @author (mardiansyaah)
 *
 */
public class A implements AddAndSubInterface{

	
	public A() {
		//Konstruktor kelas A
	       System.out.println("Ctor kelas A");
	 }

	@Override
	public String toString() {
	// TODO Auto-generated method stub
	// Method toString kelas A
	return "toString kelas A";
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
