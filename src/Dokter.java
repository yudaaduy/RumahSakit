import java.util.ArrayList;

public class Dokter extends Manusia {

	String nama;
	String spesialis;
	Pasien pasien;
	int status;
	String resep;
	int hargaDokter;

public void periksaPasienRawat(Pasien Pasien, Penyakit Penyakit, String Resep){
		if(Penyakit.getPenyakitPasien() == "valid"){
			System.out.print("Resep obat" + pasien.getPasienData());
		}else{
			System.out.print("Pasien harus rawat inap");
		}
	}

public void periksaPasienRujuk(Pasien Pasien ){
	pasien = Pasien;
	ArrayList<Penyakit> dataPasien = pasien.getPasienData();
	for(int i= 0 ; i < dataPasien.size(); i++){
		Penyakit penyakit = dataPasien.get(i);
		if(penyakit.penyakitPasien.equals("")){
			System.out.print("Resep obat" + pasien.getPasienData());
		}else {
			System.out.print("Surat rujukan ke rumah sakit pusat");
		}
	}
}

}

