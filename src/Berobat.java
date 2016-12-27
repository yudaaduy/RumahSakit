import java.util.ArrayList;
public class Berobat {

	public static void main(String[] args) {
		Berobat jalan = new Berobat();
		jalan.pergiBerobat();	}

	public void pergiBerobat(){
		int rumahYuda=2;
		int rumahSakit = 7;
		int uang = 100;
		Penumpang yuda = new Penumpang(rumahYuda, rumahSakit, uang);
		OrderGrab grab = new OrderGrab(rumahYuda, rumahSakit);
		yuda.estimasiBiaya(grab.getPerkiraanBiaya());
		yuda.orderGrab(grab);
		int lokasiSupir = 5;
		Supir yudaJuga = new Supir(lokasiSupir, grab);
		System.out.println("Posisi rumah yuda: " + rumahYuda);
		System.out.println("Posisi rumah sakit: "+ rumahSakit);
		System.out.println("Uang yuda ada " + yuda.uang);
		
		boolean isWork = yudaJuga.isOrder;
		boolean isEnough = yuda.naikGrab;
		if (isWork && isEnough){
			Kendaraan mobil = new Kendaraan("Avanza","B021XX", 5);
			yudaJuga.naikMobil(mobil);
			for (int z = yudaJuga.posisiDriver; z < yuda.lokasiAwal +1; z++){
				System.out.println(yuda.lokasiAwal);
			}
			System.out.println("Supir tiba di rumah yuda");
			yuda.naikMobil(mobil);
			
			if(mobil.kursi <= 4){
				for (int i = yuda.lokasiAwal; i < yuda.lokasiAkhir + 1;i++){
					System.out.println("yuda sekarang berada di"+ " " +i);
				}
				System.out.println("yuda sudah sampai di rumah sakit");
			}
			System.out.println("perjalanan selesai");
			yuda.bayarGrab();
			System.out.println("Uang yuda setelah bayar grab ada " + yuda.uang);
			
			
		}else{
			System.out.println("order status: "+yuda.pesanGrab.statusOrder);
		}
	
		ArrayList<Pasien> alPasien = KeluhanPasien.getPasienData();
		
		for(int i = 0;i<alPasien.size();i++){
			System.out.println("Keluhan yuda: " +alPasien.get(i).getKeluhan());
		}
	}

	public void berobat(){

	}
}
