package Pertemuan13;

public class KartuKredit extends MetodePembayaran {

	public KartuKredit(String namaPemilik) {
		super(namaPemilik);
	}

	@Override
	public void bayar(double jumlah) {
		System.out.println(namaPemilik + " membayar Rp" + jumlah + " menggunakan Kartu Kredit.");
	}
}