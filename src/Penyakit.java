import java.util.ArrayList;

public class Penyakit {
	
	public static void perediksiDokter(){
		ArrayList<Pasien> alObjPasien = KeluhanPasien.getPasienData();
		ArrayList<Pasien> alObjKeluhanDb = Dokter.getKeluhanDb();
		
		for(int i=0;i<alObjPasien.size();i++){
			for(int j=0;j<alObjKeluhanDb.size();j++){
				if(alObjPasien.get(i).getKeluhan().equals(alObjKeluhanDb.get(j).getKeluhan())){
					System.out.println("pasien ke " + (i+1) + " punya penyakit " 
							+ alObjKeluhanDb.get(j).getPenyakit() 
							+ " obatnya adalah " + alObjKeluhanDb.get(j).getObat());
				}
			}
		}
	}
}
	
