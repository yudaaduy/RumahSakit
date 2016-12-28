
import java.util.ArrayList;
public class KeluhanPasien {
	

	public static ArrayList<Pasien> getPasienData(){
		ArrayList<Pasien> alObjPasien = new ArrayList<Pasien>();
		
		Pasien pasienData1 = new Pasien();
		pasienData1.setKeluhan("Sakit Perut");
		Pasien pasienData2 = new Pasien();
		pasienData2.setKeluhan("Sakit Perut");
		Pasien pasienData3 = new Pasien();
		pasienData3.setKeluhan("Sesak Nafas");

		alObjPasien.add(pasienData1);
//		alObjPasien.add(pasienData2);
//		alObjPasien.add(pasienData3);
		
		return alObjPasien;
	}
	
	
}
