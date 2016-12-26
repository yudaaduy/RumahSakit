public class Dokter extends Manusia {
<<<<<<< Updated upstream

	String nama;
	String spesialis;
	Pasien pasien;
	int status;
	String resep;
	int hargaDokter;

	public void periksaPasienRawat(Pasien Pasien, Penyakit Penyakit, String Resep){
		if(Pasien.penyakit){
			System.out.print("Resep obat" + Penyakit);
		}else{
			System.out.print("Pasien harus rawat inap");
		}
	}

public void periksaPasienRujuk(Pasien Pasien, Penyakit penyakit, String Resep){
	if(Pasien.penyakit == penyakit){
		System.out.print("Resep obat" + penyakit);
	}else{
		System.out.print("Surat rujukan ke rumah sakit pusat");
	}
	}
=======
//	String Nama;
//	String Spesialis;
//	Pasien Pasien;
//	Penyakit penyakit;
//	int Status;
//	String Resep;
//
////public void periksaPasien(Pasien Pasien, Penyakit Penyakit, String Resep){
////	if(Pasien.penyakit == Penyakit){
////		System.out.print("Resep obat" + Penyakit);
////	}else{
////		System.out.print("Surat rujukan ke rumah sakit pusat");
////	}
////	}
//}
//
//	String nama;
//	String spesialis;
//	Pasien pasien;
//	Penyakit penyakit;
//	int status;
//	String resep;
//	int hargaDokter;
//
//	public void periksaPasien(Pasien Pasien, Penyakit Penyakit, String Resep){
//		if(Pasien.Penyakit == Penyakit){
//			System.out.print("Resep obat" + Penyakit);
//		}else{
//			System.out.print("Pasien harus rawat inap");
//		}
//	}
>>>>>>> Stashed changes
}

