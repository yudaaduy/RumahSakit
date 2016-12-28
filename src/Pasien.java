
public class Pasien extends Manusia {
	String keluhan;
	String penyakit;
	String obat;
	Penumpang yuda;

	public String getKeluhan() {
		return keluhan;
	}

	public void setKeluhan(String keluhan) {
		this.keluhan = keluhan;
	} 
	
	public void print(){
		System.out.println("uang yudha "+ yuda.uang);
	}

	public String getPenyakit() {
		return penyakit;
	}

	public void setPenyakit(String penyakit) {
		this.penyakit = penyakit;
	}

	public Penumpang getYuda() {
		return yuda;
	}

	public void setYuda(Penumpang yuda) {
		this.yuda = yuda;
	}

	public String getObat() {
		return obat;
	}

	public void setObat(String obat) {
		this.obat = obat;
	}
	
	
	
}
