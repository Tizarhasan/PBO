package Pertemuan13;

public abstract class MetodePembayaran implements Pembayaran {
	protected String namaPemilik;

	public MetodePembayaran(String namaPemilik) {
		this.namaPemilik = namaPemilik;
	}

	public void validasi() {
    System.out.println("Validasi data untuk: " + namaPemilik);
	}
}