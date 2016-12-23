
public class Berobat {

	public static void main(String[] args) {
		
	}
		
	
	public void pergiBerobat(){
		Pasien yuda = new Pasien();
		SopirGrab kuda = new SopirGrab();
		BendaMati rumahYuda = new RumahPasien();
		BendaMati rumahSakit = new RumahSakit();
		
		rumahYuda.koordinat = 1;
		rumahSakit.koordinat = 4;
		
		Perjalanan perjalananYuda = new Perjalanan(rumahYuda, rumahSakit);
		yuda.setLokasi(rumahYuda);
		
		Pesanan pesanan = yuda.pesanGrab(rumahSakit);


		yuda.jalanNaikGrab(keRumahSakit);
		
		boolean isJalan = yuda.naikGrab();
		
		thisisif:
		if(isJalan){
			Kendaraan toyotaAvanza = new Kendaraan();
			yuda.naikAvanza(toyotaAvanza);
		
			if (motorKuda.kursi == 1 && motorBegal.kursi == 0){
				int posisiMotor = yuda.jalan();
				for (int i=posisiMotor;
						i < beliMakanan.lokasiAkhir.koordinat; 
						i++) {
					System.out.println("posisi yuda sekarang di"+ " " +(i));

				int begalBeroprasi = begalSatu.jalan();
				for (int j=begalBeroprasi;
						j < startBegal.lokasiOperasiAkhir.koordinat;
						j++){
					System.out.println("posisi begal sekarang di"+ " " +(j));
				
				
			if (i == j){
				System.out.println("yuda kena begal");
				System.out.println("yuda ga selamet, kasian sekali");

				break thisisif;
				
			}
				}//tutup for02
				
				}//tutup for01	
				
				
			}else{//tutup if 02
				System.out.println("skenario belum dimulai");
			}
			
			System.out.println("perjalanan yuda sudah selesai" + " " + "yuda selamet");
		}else{//ttup if 01
			yuda.yudaMales();

			    System.out.println("pada males");
		}
	}
	
	
		public void berobat(){
			
		}
		
		
		
	

}
