public class Pasien extends Manusia {
	//MobilJalan keRumahSakit;
	RumahSakit lokasiRumahSakit;
	RumahPasien lokasiRumahPasien;
		
		public void setLokasi(BendaMati lokasi) {
			this.lokasiRumahPasien = (RumahPasien) lokasi;
		}
		public RumahSakit perjalanan(RumahSakit rumahSakit) {
			RumahSakit berobat = new RumahSakit(this.lokasiRumahPasien, rumahSakit);
			lokasiRumahSakit = rumahSakit;
			return rumahSakit.perjalananYuda();
		}
		public boolean yudaJalan() {
			return lokasiRumahSakit.valid;
		}
		public void pergiJalan(RumahSakit pasienPergiKeRumahSakit) {
			lokasiRumahSakit = pasienPergiKeRumahSakit;
		}
		public boolean pasienPergiJalan() {
			return lokasiRumahSakit.valid;
		}
		public int jalankeRumahSakit() {
			return lokasiRumahSakit.lokasiAwal.koordinat;
		}
		public void pasienSehat() {
			lokasiRumahSakit.valid = false;
		}

}
