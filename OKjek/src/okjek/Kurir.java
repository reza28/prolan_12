package OKjek;

public class Kurir extends Pesanan {
    private int beratMuatan;
    private String dimensiMuatan;

    public Kurir(int beratMuatan, String dimensiMuatan, String lokasiAwal, String destinasi, int jarak, int harga) {
        super(lokasiAwal, destinasi, jarak, harga);
        this.beratMuatan = beratMuatan;
        this.dimensiMuatan = dimensiMuatan;
    }

    public int getBerat() {
        return beratMuatan;
    }

    public String getDimensiPickup() {
        return dimensiMuatan;
    }

    public int getHarga() {
        int harga = 0;
        return harga;
    }
}