public class Ruang extends BendaMati{
	int noRuang;
	int status;
	int hargaRuang;

public void ruanganRawat (int Status, int NoRuang){
	if (Status == 0){
		System.out.print("Ruangan kosong");
		System.out.print("Pasien bisa dirawat");
	}else{
		System.out.print("Ruangan dipakai");
	}
}
}
