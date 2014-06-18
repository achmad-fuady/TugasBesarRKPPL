import java.awt.List;

/**
 * Dibuat Oleh Rezza
 */

/**
 * @author Rezza Kurniawan - (Erka)
 * Kelas E adalah kelas yang mengelola daftar atau LIST
 */
public class E {
	
	List dataList = new List();
	
	/**
	 * Konstruktor E 
	 */
	public E() {
		System.out.println("Ini Konstruktor Dari Kelas 3");
	}
	
	
	/**
	 * Fungsi yang mengembalikan status apakah sebuah String memiliki karakter 'n' 
	 */
	public boolean contains(String n) {
		if (n.contains("n")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * @return the dataList
	 */
	public List getDataList() {
		return dataList;
	}


	/**
	 * @param dataList the dataList to set
	 */
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}


	/* 
	 * Method Override yang berfungsi untuk memunculkan hasil String saat method ini di panggil
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Ini Adalah toString dari Class E Implement PowInterface");
		return result.toString();
	}
}
