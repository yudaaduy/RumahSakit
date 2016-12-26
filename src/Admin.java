import javax.net.ssl.SSLEngineResult.Status;

public class Admin extends Manusia {
	Ruang ruang;
	Dokter dokter;
	int biaya;

public boolean pasienMembayar (Duit){
	if(!Duit == membayar);
	
	
}
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
public void cekRuangan (Ruang ruang, Dokter dokter){
		if(ruang.status == 1){
			System.out.print("Ada Ruangan Kosong");
			System.out.print("Pasien Bisa Masuk Ruangan");
		}else{
			System.out.print("Ruangan Penuh");
		}
	}		
}
