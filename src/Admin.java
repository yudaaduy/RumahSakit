public class Admin extends Manusia {
	Ruang Ruang;
	Dokter Dokter;
	Duit Duit;

	public void cekRuangan (Ruang Ruang, Dokter Dokter){
		if(Pasien.Status == 1){
			System.out.print("Pasien Dirawat");
			System.out.print("Ruangan dipakai");
		}else{
			System.out.print("Ruangan kosong");
		}
		}
		
	}
}

