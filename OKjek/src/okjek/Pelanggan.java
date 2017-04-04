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
public class Pelanggan extends Orang{
    private Pesanan[] pesanan;
    private String alamat;

    public Pelanggan(String alamat, String nama, String email, String nomorTelepon) {
        super(nama, email, nomorTelepon);
        this.alamat = alamat;
    }
    
    public void createPesanan(Pesanan P) {
        
    }

    public void removePesanan() {

    }

    public Pesanan[] getPesanan() {
        return pesanan;
    }

    public String getAlamat() {
        return alamat;
    }

}