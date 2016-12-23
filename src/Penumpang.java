
public class Penumpang extends Manusia{
RumahPasien lokasiRumah;
	
	public void setLokasi(BendaMati lokasi) {
		this.lokasiRumah = (RumahPasien) lokasi;
	}

	public OrderGrab naikGrab(BendaMati rumahSakit) {
		OrderGrab pesanan = new OrderGrab(this.lokasiRumah, rumahSakit);
		return pesanan.buatPesanan();
	}
}
