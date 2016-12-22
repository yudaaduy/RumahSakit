
public class Pasien extends Manusia {
	RumahSakit lokasiRumahSakit;
	RumahPasien lokasiRumahPasien;
		
		public void setLokasi(BendaMati lokasi) {
			this.lokasiRumahpasien = (Rumahpasien) lokasi;
		}
		public RumahSakit perjalanan(BendaMati rumahSakit) {
			RumahSakit berobat = new RumahSakit(this.lokasiRumahpasien, lokasiRumahSakit);
			return berobat.pasienJalan();
		}
		
		public boolean pasienJalan() {
			return pasienJalan.valid;
		}
		public void pergiJalan(RumahSakit pasienPergiKeRumahSakit) {
			pasienBerobat = pasienPergiKeRumahSakit;
		}
		public boolean pasienPergiJalan() {
			return pasienBerobat.valid;
		}
		public int jalankeRumahSakit() {
			return pasienBerobat.lokasiAwal.koordinat;
		}
		public void pasienSehat() {
			pasienberobat.valid = false;
		}
	
	
	
}
