
public class OrderGrab {
	BendaMati lokasiAwal;
	BendaMati lokasiAkhir;
	int jarak;
	String orderId;
	boolean valid = false;
	
	public OrderGrab(BendaMati lokasiAwal, BendaMati lokasiAkhir){
		this.lokasiAwal = lokasiAwal;
		this.lokasiAkhir = lokasiAkhir;
	}
	
	public OrderGrab buatPesanan(){
		OrderGrab pesanan = new OrderGrab(this.lokasiAwal, this.lokasiAkhir);
		if ((lokasiAkhir.koordinat - lokasiAwal.koordinat) > 25){
			pesanan.valid = false;
		} else {
			pesanan.valid = true;
			pesanan.orderId = ""+lokasiAkhir.koordinat + lokasiAwal.koordinat;
		}
		return pesanan;
	}
	
}
