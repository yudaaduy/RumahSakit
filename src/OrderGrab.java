
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
		System.out.println((this.lokasiAkhir.koordinat - this.lokasiAwal.koordinat));
		if ((this.lokasiAkhir.koordinat - this.lokasiAwal.koordinat) > 25){
			this.valid = false;
		} else {
			this.valid = true;
			this.orderId = ""+lokasiAkhir.koordinat + lokasiAwal.koordinat;
		}
		return this;
	}
	
	public boolean isbiayaGrabEnough(BendaMati biayaGrab){
		//OrderGrab coba = new OrderGrab(this.biayaNaikGrab);
		//OrderGrab biaya = new OrderGrab(this.lokasiAwal, this.lokasiAkhir, this.biayaNaikGrab);
		
		System.out.println("lokasiAkhir.koordinat >> " + this.lokasiAkhir.koordinat);
		System.out.println("lokasiAwal.koordinat >> " + this.lokasiAwal.koordinat);
		System.out.println("biayaNaikGrab.duit >> " + biayaGrab.duit);
		
		System.out.println("=========================");
		
		if ((this.lokasiAkhir.koordinat - this.lokasiAwal.koordinat) > biayaGrab.duit){
			System.out.println("1");
			return  false;
		}else{
			System.out.println("2");
			return true;
		}
	}
}
