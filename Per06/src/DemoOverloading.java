package Pertemuan06b.bin;

public class DemoOverloading {
	public static void main(String[] bangkit){
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "bangkit";
		d.email = "bangkit.riders@gmail.com";
		d.info();
	}
		
}