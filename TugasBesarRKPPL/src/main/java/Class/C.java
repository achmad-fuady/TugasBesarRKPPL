package Class;
/**
 * 
 */


/**
 * @author Achmad Fuady
 * Kelas C adalah kelas yang mewarisi dari kelas abstract Math
 * isi dari kelas ini untuk menghitung add, sub, mul, div, mod dan sqrt
 */
public class C extends Math{
	private double n1 = 4;
	private double n2 = 2 ;
	
	/*
	 *	Konstruktor Dari Class C, akan di jalankan setiap class C di bangkitkan 
	 */
	public C() {
		System.out.println("Konstruktor Kelas C");
	}
	
	/*
	 * Fungsi yang di implementasi yang mengembalikan nilai hitung dari A.add
	 */
	public int add(){
		A a = new A();
		return a.add((int)n1,(int)n2);
	}
	
	/*
	 * Fungsi yang di implementasi yang mengembalikan nilai hitung dari A.sub
	 */
	public int sub(){
		A a = new A();
		return a.sub((int)n1,(int)n2);
	}
	
	/*
	 * Fungsi yang di implementasi yang mengembalikan nilai hitung dari B.mul
	 */
	public double mul(){
		B b = new B();
		return b.mul(n1,n2);
	}
	
	/*
	 * Fungsi yang di implementasi yang mengembalikan nilai hitung dari B.div
	 */
	public double div(){
		B b = new B();
		return b.div(n1,n2);
	}

	/* 
	 * Method Override yang berfungsi untuk mengembalikan hasil hitung mod saat method ini dipanggil
	 */
	@Override
	public int mod(int n1, int n2) {
		return n1%n2;
	}

	/* 
	 * Method Override yang berfungsi untuk mengembalikan hasil hitung Math.sqrt saat method ini dipanggil
	 */
	@Override
	public double sqrt(double n) {
		return java.lang.Math.sqrt(n);
	}
	
	/* 
	 * Method Override yang berfungsi untuk memunculkan hasil String saat method ini di panggil
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Ini Adalah toString dari Class C yang mewarisi dari class Abstract Math");
		return result.toString();
	}
}
