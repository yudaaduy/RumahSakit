
public class Supir extends Manusia {
OrderGrab yudaOrderGrab;

	public void terimaPesanan(OrderGrab pesanan) {
		yudaOrderGrab = pesanan;
	}

	public boolean validasiPesanan() {
		return yudaOrderGrab.valid;
	}

	public int jalan() {
		return yudaOrderGrab.lokasiAwal.koordinat;
	}

	public void tolakPesanan() {
		yudaOrderGrab.valid = false;
	}
	

}