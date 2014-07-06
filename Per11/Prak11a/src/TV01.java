package Praktikum11a.bin;

class TV01 implements Kontrol{
	String[] LineTV = {"Net.TV","Kompas TV","Metro TV","DAI TV","TVOne"};
	public void PindahLine(int Line){
		System.out.println("Memindahkan Line Pada TV01 Ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol){
		System.out.println("Memperbesar Suara TV01        : " + Vol);
	}
	public void VolKecil(int Vol){
		System.out.println("Memperkecil Suara TV01        : " + Vol);
	}
}