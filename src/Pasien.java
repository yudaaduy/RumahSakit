public class Pasien extends Manusia {
RumahPasien lokasiRumah;
public int uang;	



	public void setLokasi(BendaMati lokasi) {
		this.lokasiRumah = (RumahPasien) lokasi;
	}

	public OrderGrab naikGrab(BendaMati rumahSakit) {
		OrderGrab pesanan = new OrderGrab(this.lokasiRumah, rumahSakit);
		return pesanan.buatPesanan();
	}

}
