package Praktikum02.bin;

public class bangkit02{
	private String nama;
	public static void main(String[] bangkit){
		bangkit02 test;
		test = new bangkit02();
		test.setNama("Fajar");
		byte b = 100;
		short s = 100;
		
		bangkit02 belajarVariabel = test;
		belajarVariabel.setNama("Belajar variabel");
		
		System.out.println(b + s);
		System.out.println("Nama : " + test.getNama() + " " + b);
	}
	
	public void setNama(String aNama){
		this.nama = aNama;
	}
	
	public String getNama(){
		return this.nama;
	}
}