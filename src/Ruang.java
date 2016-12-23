public class Ruang extends BendaMati{
	int NoRuang;
	int Status;

public void ruanganRawat (int Status, int NoRuang){
	if (Status == 0){
		System.out.print("Ruangan kosong");
	}else{
		System.out.print("Ruangan dipakai");
	}
}
}
