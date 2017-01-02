import java.util.ArrayList;
public class RumahSakit {
	//Pasien = yudaYangSakit;
	
	public static void main(String[] args) {
		RumahSakit jalan = new RumahSakit();
		jalan.pergiBerobat();
		
		//System.out.println("");
		//jalan.berobat();

	}
	
	public void pergiBerobat(){
		int rumahYuda=1;
		int rumahSakit = 15;
		int uang = 1;
		Penumpang yuda = new Penumpang(rumahYuda, rumahSakit, uang);
		OrderGrab grab = new OrderGrab(rumahYuda, rumahSakit);
		yuda.estimasiBiaya(grab.getPerkiraanBiaya());
		System.out.println("uang yuda: "+ yuda.uang);
		System.out.println("biaya grab: "+ grab.getPerkiraanBiaya());
		//System.out.println(grab.getPerkiraanBiaya());
		boolean isOrder = yuda.naikGrab;
		if (isOrder){
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
				//System.out.println();
				System.out.println(grab.statusOrder);
				//yudaJuga.posisiDriver = (yuda.lokasiAwal > yudaJuga.posisiDriver)? yudaJuga.posisiDriver : 0-yudaJuga.posisiDriver;
				for (int z = yuda.lokasiAwal; z <= yudaJuga.posisiDriver; z++){
					System.out.println("driver menuju rumah yuda di koordinat "+yuda.lokasiAwal+
							" driver sekarang ada di koordinat "+ z);
				}
				
				System.out.println(grab.statusOrder);
				System.out.println("biaya naik grab adalah "+yuda.pesanGrab.biayaPerjalanan);
				yuda.naikMobil(mobil);
				System.out.println("yuda menaiki kendaraan:" + mobil.type + " no polisi "+mobil.noPol);
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
			
//			yudaYangSakit = new Pasien();
//			yudaYangSakit.yuda = yuda;
			Penyakit prediksiDokter = new Penyakit();
			prediksiDokter.perediksiDokter();
		}else{
			System.out.println("uang yuda tidak cukup");
		}
		
	}

}
