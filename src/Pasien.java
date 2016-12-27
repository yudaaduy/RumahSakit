
public class Pasien extends Manusia {
	String keluhan;
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
	
}
