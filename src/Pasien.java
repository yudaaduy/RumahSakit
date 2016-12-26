import java.util.ArrayList;

public class Pasien extends Manusia {
RumahPasien lokasiRumah;
DuitPasien duitPasien;
OrderGrab yudaCekDuit;
boolean isDuidCukup = false;

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

	public OrderGrab naikGrab(BendaMati rumahYuda, BendaMati rumahSakit) {
		OrderGrab pesanan = new OrderGrab(rumahYuda, rumahSakit, rumahSakit);
		return pesanan.buatPesanan();
	}
	
	public void biayaNaikGrab(BendaMati biayaGrab ,OrderGrab pesanan){
		this.isDuidCukup = pesanan.isbiayaGrabEnough(biayaGrab);
	}
	
	public static ArrayList<Penyakit> getPasienData(){
		ArrayList<Penyakit> alObjPasien = new ArrayList<Penyakit>();
		
		Penyakit keluhanPasien = new Penyakit();
		keluhanPasien.setPenyakitPasien("sakit perut");
		alObjPasien.add(keluhanPasien);
		
		return alObjPasien;
	}
}
