import java.util.ArrayList;

public class Berobat {

	public static void main(String[] args) {
		Berobat jalan = new Berobat();
		jalan.pergiBerobat();
	}

	public void pergiBerobat(){
		
		Pasien yuda = new Pasien();
		BendaMati rumahYuda = new RumahPasien();
		BendaMati rumahSakit = new RumahSakit();
		BendaMati duitYuda = new DuitPasien();
		rumahYuda.koordinat = 5;
		rumahSakit.koordinat = 10;
		duitYuda.duit = 200;
		yuda.setLokasi(rumahYuda);
		yuda.setDuit(duitYuda);
		
		OrderGrab pesanan = yuda.naikGrab(rumahYuda,rumahSakit);	
		System.out.println("bisa pesan ato ngak : "+ pesanan.valid);
		
		yuda.biayaNaikGrab(duitYuda , pesanan);
		System.out.println("yuda punya duid pa ngak : "+ yuda.isDuidCukup);
		
		Supir supirGrab = new Supir();
		yuda.pesanGrab(pesanan);
		
		supirGrab.terimaPesanan(pesanan);
	
		
		boolean isValid = supirGrab.validasiPesanan();
		boolean isOk = yuda.cekDuitCukupAtauTidak();
		
		if(isValid && isOk){
			Mobil mobil = new Mobil();
			supirGrab.naikMobil(mobil);
			yuda.naikMobil(mobil);
			if (mobil.kursi <= 3){
				int posisiMobil = supirGrab.jalan();
				for (int i=posisiMobil;
						i < pesanan.lokasiAkhir.koordinat; 
						i++) {
					System.out.println("Belum sampai, kurang "+ (pesanan.lokasiAkhir.koordinat - i + " koordinat") + " lagi");
				}
				System.out.println("perjalanan sudah selesai");
				System.out.println("yuda sampai ke rumah sakit");
				ArrayList<Penyakit> alPasien = Pasien.getPasienData();
				for(int i = 0;i<alPasien.size();i++){
					System.out.println("keluhan yuda:" + " " + alPasien.get(i).getPenyakitPasien());
				}
			}else {
		 		System.out.println("supir grab belum sampai");
			}
		}else{
			supirGrab.tolakPesanan();
			System.out.println("jarak penumpang ke sopir terlalu jauh");
		}
	}


//	public void duitBerobat(){
//		int Benda
//
//	}
//	
	public int getKembalian(int uang, int kordinatRumah, int kordinatRumahsakit){
		return uang - (kordinatRumahsakit - kordinatRumah);
	}
}
