/**
 * Dibuat oleh Danar Mardiansyah
 */
package Class;

import Interface.MulAndDivInterface;

/**
 * @author mardiansyaah
 *
 */
public class B implements MulAndDivInterface {

    public B() {
        System.out.println("Ctor kelas B");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "toString kelas B";
    }

	/* (non-Javadoc)
	 * @see Interface.MulAndDivInterface#mul(double, double)
	 */
	public double mul(double m1, double m2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see Interface.MulAndDivInterface#div(double, double)
	 */
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return 0;
	}

    
}
