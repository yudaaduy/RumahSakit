import java.util.ArrayList;
public class KeluhanPasien {
	

	public static ArrayList<Pasien> getPasienData(){
		ArrayList<Pasien> alObjPasien = new ArrayList<Pasien>();
		
		Pasien pasienData1 = new Pasien();
		pasienData1.setKeluhan("Sakit Perut");

		alObjPasien.add(pasienData1);
		
		return alObjPasien;
	}
}
