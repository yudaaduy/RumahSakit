public class Dokter extends Manusia {
	String Nama;
	String Spesialis;
	Pasien Pasien;
	Penyakit Penyakit;
	int Status;
	String Resep;

public void periksaPasien(Pasien Pasien, Penyakit Penyakit, String Resep){
	if(Pasien.Penyakit == Penyakit){
		System.out.print("Resep obat" + Penyakit);
	}else{
		System.out.print("Surat rujukan ke rumah sakit pusat");
	}
	}
}
