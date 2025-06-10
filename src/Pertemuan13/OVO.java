package Pertemuan13;

public class OVO extends MetodePembayaran {

	public OVO(String namaPemilik) {
		super(namaPemilik);
	}

	@Override
	public void bayar(double jumlah) {
		System.out.println(namaPemilik + " membayar Rp" + jumlah + " menggunakan OVO.");
	}
}
