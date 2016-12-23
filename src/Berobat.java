public class Berobat {

	public static void main(String[] args) {
		Berobat jalan = new Berobat();
		jalan.pergiBerobat();
	}

	public void pergiBerobat(){
		Pasien yuda = new Pasien();
		BendaMati rumahYuda = new RumahPasien();
		BendaMati rumahSakit = new RumahSakit();
		rumahYuda.koordinat = 5;
		rumahSakit.koordinat = 40;
		yuda.duit = 200;
		yuda.setLokasi(rumahYuda);
		OrderGrab pesanan = yuda.naikGrab(rumahSakit);
		Supir supirGrab = new Supir();
		supirGrab.terimaPesanan(pesanan);
		boolean isValid = supirGrab.validasiPesanan();
		if(isValid){
			System.out.println("sukses");
			
		}else{
			System.out.println("not sukses");
		}
	}


	public void berobat(){

	}
}
