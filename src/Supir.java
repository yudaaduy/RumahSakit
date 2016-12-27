
public class Supir extends Manusia {
	int posisiDriver;
	OrderGrab pesanan;
	boolean isOrder;
	Kendaraan mobil;
	
	Supir (int posisiDriver, OrderGrab pesanan){
		this.posisiDriver = posisiDriver;
		this.pesanan = pesanan;
		this.terimaOrderAtauTidak();
	}
	
	public void terimaOrderAtauTidak(){
		if(this.posisiDriver - this.pesanan.lokasiAwal < 10){
			this.pesanan.setStatus("Order Diterima Driver");
			isOrder = true;
			this.pesanan.mobil = this.mobil;
		}else {
			this.pesanan.setStatus("Order Ditolak Driver");
			isOrder = false;
		}
	}
}