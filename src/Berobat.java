public class Berobat {

	public static void main(String[] args) {
		
	}
		
	
	public void pergiBerobat(){
		Pasien yuda = new Pasien();
		Supir supirGrab = new Supir();
		BendaMati rumahYuda = new RumahPasien();
		BendaMati rumahSakit = new RumahSakit();
		
		rumahYuda.koordinat = 1;
		rumahSakit.koordinat = 4;
		MobilJalan perjalananYuda = new MobilJalan(rumahYuda, rumahSakit);
		yuda.setLokasi(rumahYuda);
		MobilJalan pesanan = yuda.perjalanan(rumahSakit);
		yuda.perjalanan(rumahSakit)(keRumahSakit);
		boolean isJalan = yuda.naikGrab();
		
		thisisif:
		if(isJalan){
			Kendaraan toyotaAvanza = new Kendaraan();
			yuda.naikAvanza(toyotaAvanza);
			supirGrab.naikAvanza(toyotaAvanza);
		
			if (toyotaAvanza.kursi <= 5){
				int posisiMobil = yuda.jalan();
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
						supirGrab.tolakPesanan();
						System.out.println("pesanan invalid");
		}
	}
	
	
		public void berobat(){
			
		}
}
