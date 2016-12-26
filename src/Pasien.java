import java.util.ArrayList;

public class Pasien extends Manusia {
RumahPasien lokasiRumah;
DuitPasien duitPasien;
OrderGrab yudaCekDuit;

	public void setLokasi(BendaMati lokasi) {
		this.lokasiRumah = (RumahPasien) lokasi;
	}
	
	public void pesanGrab(OrderGrab biaya) {
		yudaCekDuit = biaya;
	}

	public boolean cekDuitCukupAtauTidak() {
		return yudaCekDuit.valid;
	}

	public int duitCukup() {
		return yudaCekDuit.biayaNaikGrab.duit;
	}

	public void duitTidakCukup() {
		yudaCekDuit.valid = false;
	}
	
	public void setDuit(BendaMati duit){
		this.duitPasien  = (DuitPasien) duit;
	}

	public OrderGrab naikGrab(BendaMati rumahSakit) {
		OrderGrab pesanan = new OrderGrab(this.lokasiRumah, rumahSakit, rumahSakit);
		return pesanan.buatPesanan();
	}
	
	public OrderGrab biayaNaikGrab(BendaMati biayaGrab){
		OrderGrab biaya = new OrderGrab(this.duitPasien, biayaGrab, biayaGrab);
		return biaya.biayaGrab();
	}
	
	public static ArrayList<Penyakit> getPasienData(){
		ArrayList<Penyakit> alObjPasien = new ArrayList<Penyakit>();
		
		Penyakit keluhanPasien = new Penyakit();
		keluhanPasien.setPenyakitPasien("sakit perut");
		alObjPasien.add(keluhanPasien);
		
		return alObjPasien;
	}
}
