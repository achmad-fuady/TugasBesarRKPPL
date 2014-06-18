/**
 * Dibuat Oleh Mardiansyah Danar
 */
package Class;

import Interface.MulAndDivInterface;


/**
 * @author (mardiansyaah)
 *
 */
public class B implements MulAndDivInterface {

    public B() {
    	//konstruktor menampilkan Ctor kelas B
        System.out.println("Ctor kelas B");
    }

    @Override
    public String toString() {
    	// to Sting kelas 
        // TODO Auto-generated method stub
        return "toString kelas B";
    }

	/* (non-Javadoc)
	 * @see Interface.MulAndDivInterface#mul(double, double)
	 */
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		// Operator perkalian
        return n1 * n2;
	}

	/* (non-Javadoc)
	 * @see Interface.MulAndDivInterface#div(double, double)
	 */
	public double div(double n1, double n2) {
		//Operator Pembagian
		// TODO Auto-generated method stub
		if (n2 != 0) {
            return n1 / n2;
        } else {
            return 0;
        }
	}

    
}
