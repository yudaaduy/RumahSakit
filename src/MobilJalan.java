
public class MobilJalan extends BendaMati {
	BendaMati lokasiAwal;
	BendaMati lokasiAkhir;
	
	int jarak;
	String tempat;
	boolean valid = false;
	
	public MobilJalan(BendaMati lokasiAwal, BendaMati lokasiAkhir){
		this.lokasiAwal = lokasiAwal;
		this.lokasiAkhir = lokasiAkhir;
	}
	
	public MobilJalan perjalananYuda(){
		MobilJalan lokasiKejadianBegal = new MobilJalan(this.lokasiAwal, this.lokasiAkhir);
		if ((lokasiAkhir.koordinat - lokasiAwal.koordinat) > 10){
			lokasiKejadianBegal.valid = false;
		} else {
			lokasiKejadianBegal.valid = true;
			lokasiKejadianBegal.tempat = ""+lokasiAkhir.koordinat + lokasiAwal.koordinat;
		}
		return lokasiKejadianBegal;
	}
	
}
