import java.util.ArrayList;

public class Penyakit {
	String sakit;
	String mag;
	String asma;
	String penyakitPasien;
	KeluhanPasien yudaBerobat;
	
	public String getPenyakitPasien() {
		return penyakitPasien;
	}
	public void setPenyakitPasien(String penyakitPasien) {
		this.penyakitPasien = penyakitPasien;
	}
	
	public void iniPenyakit(){
		ArrayList<Pasien> alPasien = KeluhanPasien.getPasienData();
		for(int i = 0;i<alPasien.size();i++){
		if (alPasien.get(i).getKeluhan() == "Sakit Perut"){
			this.sakit = "asma";
			System.out.println(this.sakit);
		}
			//System.out.println("Keluhan yuda: " +alPasien.get(i).getKeluhan());
		}
		//yudaBerobat.getPasienData();
	}
	
}
