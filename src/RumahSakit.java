public class RumahSakit extends BendaMati {

	Dokter Dokter;
	Pasien Pasien;
	Ruang Ruang;
	Apotek Apotek;
//int Kordinat;
	
	BendaMati lokasiAwal;
	BendaMati lokasiAkhir;
	int jarak;
	String tempat;
	boolean valid = false;
	
	public RumahSakit(BendaMati lokasiAwal, BendaMati lokasiAkhir){
		this.lokasiAwal = lokasiAwal;
		this.lokasiAkhir = lokasiAkhir;
	}
	
	public RumahSakit perjalananYuda(){
		RumahSakit yudaBerobat = new RumahSakit(this.lokasiAwal, this.lokasiAkhir);
		if ((lokasiAkhir.koordinat - lokasiAwal.koordinat) > 10){
			yudaBerobat.valid = false;
		} else {
			yudaBerobat.valid = true;
			yudaBerobat.tempat = ""+lokasiAkhir.koordinat + lokasiAwal.koordinat;
		}
		return yudaBerobat;
	}	
	
}
