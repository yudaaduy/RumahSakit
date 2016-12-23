public class Dokter extends Manusia {
	String nama;
	String spesialis;
	Pasien pasien;
	Penyakit penyakit;
	int status;
	String resep;
	int hargaDokter;

	public void periksaPasien(Pasien Pasien, Penyakit Penyakit, String Resep){
		if(Pasien.Penyakit == Penyakit){
			System.out.print("Resep obat" + Penyakit);
		}else{
			System.out.print("Pasien harus rawat inap");
		}
	}
}