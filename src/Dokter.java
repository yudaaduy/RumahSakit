import java.util.ArrayList; 
 
public class Dokter extends Manusia {
	String nama; 
	String spesialis; 
	int hargaDokter; 
	
	public static ArrayList<Pasien> getKeluhanDb(){
		ArrayList<Pasien> alDbPenyakit = new ArrayList<Pasien>();
		
		Pasien jenisPenyakit1 = new Pasien();
		jenisPenyakit1.setKeluhan("Sakit Perut");
		jenisPenyakit1.setPenyakit("Maag");
		jenisPenyakit1.setObat("dagorin");
		
		Pasien jenisPenyakit2 = new Pasien();
		jenisPenyakit2.setKeluhan("Sesak Nafas");
		jenisPenyakit2.setPenyakit("Asma");
		jenisPenyakit2.setObat("bufferin");
		
		Pasien jenisPenyakit3 = new Pasien();
		jenisPenyakit3.setKeluhan("Batuk");
		jenisPenyakit3.setPenyakit("Flu");
		jenisPenyakit3.setObat("patenin");

		alDbPenyakit.add(jenisPenyakit1);
		alDbPenyakit.add(jenisPenyakit2);
		alDbPenyakit.add(jenisPenyakit3);
		
		return alDbPenyakit;
	}
 
//	public void periksaPasienRawat(Pasien Pasien, Penyakit Penyakit, String Resep){
//	    if(Pasien.penyakit){ 
//	      System.out.print("Resep obat" + Penyakit); 
//	    if(Penyakit.getPenyakitPasien().equals("")){ 
//	      System.out.print("Resep obat" + pasien.getPasienData()); 
//	    }else{ 
//	      System.out.print("Pasien harus rawat inap"); 
//	    } 
//	  } 
//	}
//	public void periksaPasienRujuk(Pasien Pasien, Penyakit penyakit, String Resep){ 
//	  if(Pasien.penyakit == penyakit){ 
//	    System.out.print("Resep obat" + penyakit); 
//	  }
//	}
//	public void periksaPasienRujuk(Pasien Pasien ){ 
//	  pasien = Pasien; 
//	  ArrayList<Penyakit> dataPasien = pasien.getPasienData(); 
//	  for(int i= 0 ; i < dataPasien.size(); i++){ 
//	    Penyakit penyakit = dataPasien.get(i); 
//	    if(penyakit.penyakitPasien.equals("")){ 
//	      System.out.print("Resep obat" + pasien.getPasienData()); 
//	    }else { 
//	      System.out.print("Surat rujukan ke rumah sakit pusat"); 
//	    } 
//	  }
//	}
}
