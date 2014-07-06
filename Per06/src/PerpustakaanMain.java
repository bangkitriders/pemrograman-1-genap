package Pertemuan06d.bin;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanMain {
	public static void main(String[] bangkit){
		File file = new File("D:/Perpustakaan.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		List<Perpustakaan> listPerpustakaan = new ArrayList<Perpustakaan>();
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			while(dis.available() != 0){
				String line = dis.readLine();
				String[] data = line.split(",");
				
				Perpustakaan p = new Perpustakaan();
				p.setId(data[0]);
				p.setNamaPeminjam(data[1]);
				p.setJudulBuku(data[2]);
				
				listPerpustakaan.add(p);
			}
		} catch (IOException ex){
			System.out.println("File " + file.getName() + " tidak Ketemu !!");
			System.out.println("Exception : " + ex.getMessage());
		}
		
		for(Perpustakaan perpus : listPerpustakaan){
			System.out.println("============================================");
			System.out.println("ID : " + perpus.getId());
			System.out.println("Penyewa : " + perpus.getNamaPeminjam());
			System.out.println("Judul : " + perpus.getJudulBuku());
		}
	}
}