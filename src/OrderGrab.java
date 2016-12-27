
public class OrderGrab {
	int lokasiAwal;
	int lokasiAkhir;
	int biayaPerjalanan;
	String orderId;
	String statusOrder;
	Kendaraan mobil;
	//---------------------biaya----------------------
	OrderGrab (int lokasiAwalPenumpang, int lokasiAkhirPenumpang){
		this.lokasiAwal = lokasiAwalPenumpang;
		this.lokasiAkhir = lokasiAkhirPenumpang;
		this.hitungBiayaPerjalanan();
	}
	
	public void hitungBiayaPerjalanan(){
		this.biayaPerjalanan = lokasiAkhir - lokasiAwal;
	}
	
	public int getPerkiraanBiaya(){
		return this.biayaPerjalanan;
	}
	
	public int biayaPerjalanan(){
		return biayaPerjalanan;
	}
	
	public void setBiaya(int biayaPerjalanan) {
		this.biayaPerjalanan = biayaPerjalanan;
	}
	//-------------orderid------------------
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return statusOrder;
	}

	public void setStatus(String status) {
		this.statusOrder = status;
	}
	
}
