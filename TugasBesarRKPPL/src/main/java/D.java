import Interface.PowInterface;

/**
 * Dibuat Oleh Rezza
 */

/**
 * @author Rezza Kurniawan - (Erka)
 * Kelas D adalah kelas yang menggunakan interface Pow
 * isi dari kelas ini untuk menghitung math.pow
 */
public class D implements PowInterface {

	/**
	 *	Konstruktor Dari Class D, akan di jalankan setiap class D di bangkitkan 
	 */
	public D() {
		System.out.println("Konstruktor Kelas D");
	}

	/* 
	 * Fungsi yang di implementasi yang mengembalikan nilai hitung dari Math.Pow
	 */
	public double pow(double n1, double n2) {
		double result = Math.pow(n1, n2);
		return result;
	}
	
	/* 
	 * Method Override yang berfungsi untuk memunculkan hasil String saat method ini di panggil
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Ini Adalah toString dari Class D Implement PowInterface");
		return result.toString();
	}
	
}
