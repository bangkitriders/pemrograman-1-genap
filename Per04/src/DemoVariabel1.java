// Latihan Variabel
package Latihan01.sesi1.bin;

public class DemoVariabel1{
	
	public static void main(String[] bangkit){
		int x=10;
		System.out.println("Nilai X adalah " + x);
		
		char z = 'a';
		System.out.println("Nilai Z adalah " + z);
		
		
		int y=z;
		System.out.println("Nilai Y adalah " + y);
		
		/*
		char w=x;
		System.out.println("nilai W adalah " + w);
		*/
		
		char v = (char) x;
		System.out.println("Nilai V adalah " + v);
		System.out.println("Baris Selanjutnya");
		
		coba();
		System.out.println("Setelah menjalankan coba");
	}
	
	static char v;
	
	public static void coba(){
		System.out.println("Nilai V adalah " + v);
		short d = 15;
		System.out.println("D adalah : " + d);
	}
	
}