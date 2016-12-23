public class Berobat {

	public static void main(String[] args) {
		Berobat jalan = new Berobat();
		jalan.pergiBerobat();
	}

	public void pergiBerobat(){
		Pasien yuda = new Pasien();
		Supir supirGrab = new Supir();
		BendaMati rumahYuda = new RumahPasien();
		BendaMati rumahSakit = new TujuanPasien();

		yuda.setLokasi(rumahYuda);
		rumahYuda.koordinat = 2;
		rumahSakit.koordinat = 6;
		RumahSakit tujuan = new RumahSakit(rumahYuda, rumahSakit);
		RumahSakit pesanan = yuda.perjalanan(tujuan);

		//yuda.perjalanan(rumahSakit)(keRumahSakit);
		boolean isJalan = yuda.yudaJalan();


		if(isJalan){
			ToyotaAvanza toyotaAvanza = new ToyotaAvanza();
			yuda.naikAvanza(toyotaAvanza);
			supirGrab.naikAvanza(toyotaAvanza);

			if (toyotaAvanza.kursi <= 5){
				int posisiMobil = yuda.jalankeRumahSakit();
				for (int i=posisiMobil;
						i < pesanan.lokasiAkhir.koordinat; 
						i++) {
					System.out.println("Belum sampai, kurang "+ (pesanan.lokasiAkhir.koordinat - i) + "lagi");
				}
				System.out.println("perjalanan sudah selesai");
			}else {
				System.out.println("penumpang atau driver kosong");
			}
		}else{
//			supirGrab.supirMasihMakan();
			System.out.println("pesanan invalid");
		}
	}


	public void berobat(){

	}
}
