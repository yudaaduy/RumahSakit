
public class Supir extends Manusia {
	MobilJalan grabKerja;
	TempatMakan tempatMangkal;

	public void setLokasiMangkal(BendaMati lokasiWarteg) {
		this.tempatMangkal = (TempatMakan) lokasiWarteg;
	}
	public MobilJalan cariMangsa(BendaMati lokasiWarteg) {
		MobilJalan grabBeroperasi = new MobilJalan(this.tempatMangkal, lokasiWarteg);
		return grabBeroperasi.perjalananYuda();
	}
	public boolean grabKerja() {
		return grabKerja.valid;
	}
	public void dapetPenumpang(MobilJalan jemputYuda) {
		grabKerja = jemputYuda;
	}
	public boolean begalYuda() {
		return grabKerja.valid;
	}
	public int jalan() {
		return grabKerja.lokasiAwal.koordinat;
	}
	public void begalMales() {
		grabKerja.valid = false;
	}
}