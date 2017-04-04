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
public class Pesanan {
    private final String lokasiAwal;
    private final String destinasi;
    private final int jarak;
    protected int harga;

    public Pesanan(String lokasiAwal, String destinasi, int jarak, int harga) {
        this.lokasiAwal = lokasiAwal;
        this.destinasi = destinasi;
        this.jarak = jarak;
        this.harga = harga;
    }

    public String getLokasiAwal() {
        return lokasiAwal;
    }
    
    public String getDestinasi() {
        return destinasi;
    }

    public int getJarak() {
        return jarak;
    }

    public int getHarga() {
        return harga;
    }
}
