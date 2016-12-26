public class Apotek {
	Obat obat;
	

public int pembayaran (Obat obat, int pembayaran){
	System.out.println(obat.harga * obat.jumlah);
	return pembayaran;
}
}