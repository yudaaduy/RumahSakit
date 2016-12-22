public class Admin extends Manusia {
	Ruang Ruang;
	Dokter Dokter;

	public void cekRuangan (Ruang Ruang, Dokter Dokter){
		if(Pasien.Status == 1){
			System.out.print("Pasien Dirawat");
		}else{
			System.out.print("Ruangan dipakai");
		}
		}
		
	}
}

