public class Admin extends Manusia {
	Ruang ruang;
	Dokter dokter;
	Duit duit;
	int biaya;

public int membayar (Ruang ruang, Dokter dokter, int membayar){
	System.out.println(ruang.hargaRuang + dokter.hargaDokter);
	return membayar;
}	

public void cekRuangan (Ruang ruang, Dokter dokter){
		if(Pasien.status == 1){ 
			System.out.print("Pasien Dirawat");
			System.out.print("Ruangan dipakai");
		}else{
			System.out.print("Ruangan kosong");
		}
	}
}