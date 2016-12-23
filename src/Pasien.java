public class Pasien extends Manusia {
	MobilJalan keRumahSakit;
	RumahSakit lokasiRumahSakit;
	RumahPasien lokasiRumahPasien;
		
		public void setLokasi(BendaMati lokasi) {
			this.lokasiRumahPasien = (RumahPasien) lokasi;
		}
		public MobilJalan perjalanan(BendaMati rumahSakit) {
			MobilJalan berobat = new MobilJalan(this.lokasiRumahPasien, rumahSakit);
			return berobat.perjalananYuda();
		}
		public boolean pasienJalan() {
			return keRumahSakit.valid;
		}
		public void pergiJalan(MobilJalan pasienPergiKeRumahSakit) {
			keRumahSakit = pasienPergiKeRumahSakit;
		}
		public boolean pasienPergiJalan() {
			return keRumahSakit.valid;
		}
		public int jalankeRumahSakit() {
			return keRumahSakit.lokasiAwal.koordinat;
		}
		public void pasienSehat() {
			keRumahSakit.valid = false;
		}
}
