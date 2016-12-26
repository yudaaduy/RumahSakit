import javax.net.ssl.SSLEngineResult.Status;

public class Admin extends Manusia {
	Ruang ruang;
	Dokter dokter;
	Pasien pasien;
	int biaya;

public void cekRuangan (Ruang ruang, Dokter dokter){
		if(ruang.status == 1){
			System.out.print("Ada Ruangan Kosong");
			System.out.print("Pasien Bisa Masuk Ruangan");
		}else{
			System.out.print("Ruangan Penuh");	
		}
}	
public int membayar (Ruang ruang, Dokter dokter, int membayar){
		System.out.println(ruang.hargaRuang + dokter.hargaDokter);
		return membayar;
}
//public boolean pasienMembayar (Pasien pasien){
//	if( << membayar(ruang, dokter, membayar));
//
//	}
}