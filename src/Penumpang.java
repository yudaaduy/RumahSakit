
public class Penumpang extends Manusia{
	int lokasiAwal;
	int lokasiAkhir;
	int uang;
	boolean naikGrab;
	OrderGrab pesanGrab; 

	Penumpang(int lokasiAwal, int lokasiAkhir, int uang){
		this.lokasiAwal = lokasiAwal;
		this.lokasiAkhir = lokasiAkhir;
		this.uang = uang;
	}

	public void estimasiBiaya(int estimasiBiaya){
		if(estimasiBiaya > uang){
			naikGrab = false;
		}else{
			naikGrab = true;
		}
	}
	
	public void orderGrab(OrderGrab orderGrab){
		this.pesanGrab = orderGrab;
		this.pesanGrab.orderId = "ORD" + orderGrab.lokasiAkhir + orderGrab.lokasiAwal;
		this.pesanGrab.statusOrder = "mencari driver";
	}
	
	public void bayarGrab(){
		this.uang = this.uang - this.pesanGrab.biayaPerjalanan;
		this.pesanGrab.statusOrder = "sampai di tujuan";
	}
	
	


	
	
}
