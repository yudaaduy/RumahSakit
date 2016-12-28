import java.util.ArrayList;

public class Penyakit {
	
	
//	public String getPenyakitPasien() {
//		return penyakitPasien;
//	}
//	
//	public void setPenyakitPasien(String penyakitPasien) {
//		this.penyakitPasien = penyakitPasien;
//	}
	
	public static void mendugaan(){
		ArrayList<Pasien> alObjPasien = KeluhanPasien.getPasienData();
		ArrayList<Pasien> alObjKeluhanDb = Dokter.getKeluhanDb();
		
		
		for(int i=0;i<alObjPasien.size();i++){
			for(int j=0;j<alObjKeluhanDb.size();j++){
				if(alObjPasien.get(i).getKeluhan().equals(alObjKeluhanDb.get(j).getKeluhan())){
					System.out.println("pasien ke " + (i+1) + " punya penyakit " + alObjKeluhanDb.get(j).getPenyakit() + " obatnya adalah " + alObjKeluhanDb.get(j).getObat());
				}
			}
			
			
//			if(alObjPasien.get(i).getKeluhan().equals(alObjKeluhanDb.get(i).getKeluhan())){
//				System.out.println("penyakit dari keluhan " + alObjPasien.get(i).getKeluhan() + " adalah " + alObjKeluhanDb.get(i).getPenyakit() + " obatnya adalah " + alObjKeluhanDb.get(i).getObat());
//			}
		}
	}
	
//	public void iniPenyakit(){
//		ArrayList<Pasien> alPasien = KeluhanPasien.getPasienData();
//		for(int i = 0;i<alPasien.size();i++){
//		if (alPasien.get(i).getKeluhan() == "Sakit Perut"){
//			this.flu = "Mag";
//			System.out.println(this.flu);
//		}
//			System.out.println("Keluhan yuda: " +alPasien.get(i).getKeluhan());
//		}
////		yudaBerobat.getPasienData();
//	}
	
}