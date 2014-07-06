package Praktikum11a.bin;

class TV02 implements Kontrol{
	String[] LineTV = {"RCTI","SCTV","ANTV","MNCTV","Global TV"};
	public void PindahLine(int Line){
		System.out.println("Memindahkan Line Pada TV02 Ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol){
		System.out.println("Memperbesar Suara TV02        : " + Vol);
	}
	public void VolKecil(int Vol){
		System.out.println("Memperkecil Suara TV02        : " + Vol);
	}
}