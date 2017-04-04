/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okjek;

/**
 *
 * @author reza
 */
public class Pengemudi extends Orang{
    private Pesanan[] pesanan;
    private String nomorKendaraan;
    private int rating;

    public Pengemudi(String nomorKendaraan, String nama, String email, String nomorTelepon) {
        super(nama, email, nomorTelepon);
        this.nomorKendaraan = nomorKendaraan;
    }
    
    public void addPesanan(Pesanan p) {
            
    }

    public Pesanan[] getPesanan() {
        return pesanan;
    }

    public void removePesanan(Pesanan p) {

    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }
    
}
