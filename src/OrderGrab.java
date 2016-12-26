
public class OrderGrab {
	BendaMati lokasiAwal;
	BendaMati lokasiAkhir;
	BendaMati biayaNaikGrab;
	
	int jarak;
	String orderId;
	boolean valid = false;
	
	public OrderGrab(BendaMati lokasiAwal, BendaMati lokasiAkhir, BendaMati biayaNaikGrab){
		this.lokasiAwal = lokasiAwal;
		this.lokasiAkhir = lokasiAkhir;
		this.biayaNaikGrab = biayaNaikGrab;
	}
	
	public OrderGrab buatPesanan(){
		OrderGrab pesanan = new OrderGrab(this.lokasiAwal, this.lokasiAkhir, this.biayaNaikGrab);
		if ((lokasiAkhir.koordinat - lokasiAwal.koordinat) > 25){
			pesanan.valid = false;
		} else {
			pesanan.valid = true;
			pesanan.orderId = ""+lokasiAkhir.koordinat + lokasiAwal.koordinat;
		}
		return pesanan;
	}
	
	public OrderGrab biayaGrab(){
		//OrderGrab coba = new OrderGrab(this.biayaNaikGrab);
		OrderGrab biaya = new OrderGrab(this.lokasiAwal, this.lokasiAkhir, this.biayaNaikGrab);
		
		System.out.println("lokasiAkhir.koordinat >> " + lokasiAkhir.koordinat);
		System.out.println("lokasiAwal.koordinat >> " + lokasiAwal.koordinat);
		System.out.println("biayaNaikGrab.duit >> " + biayaNaikGrab.duit);
		
		if ((lokasiAkhir.koordinat - lokasiAwal.koordinat) > biayaNaikGrab.duit){
			biaya.valid = false;
		}else{
			biaya.valid = true;
		}
		return biaya;
	}
}
