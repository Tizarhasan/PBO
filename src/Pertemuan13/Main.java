package Pertemuan13;

public class Main {
    public static void main(String[] args) {
        Hewan[] hewanList = {
            new Anjing("Doggy"),
            new Kucing("Kitty")
        };

        for (Hewan h : hewanList) {
            h.makan();  // Polymorphism dari kelas abstrak
            if (h instanceof Suara) {
                ((Suara) h).buatSuara();  // Polymorphism dari interface
            }
            System.out.println();
        }
        
        
        
        MetodePembayaran[] pembayaranList = {
        		new OVO("Andi"),
        		new KartuKredit("Sari")
        		};

        		    for (MetodePembayaran mp : pembayaranList) {
        		        mp.validasi();
        		        mp.bayar(150000);
        		        System.out.println();
        		    }
        
    }
}

