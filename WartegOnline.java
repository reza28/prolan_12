package wartegonline;

import java.util.Scanner;
public class WartegOnline extends Menu{
    Scanner input = new Scanner(System.in);
    private String namaWartegOnline, namaToko;
    
    public String getNamaWartegOnline(){
        return namaWartegOnline;
    }
    public void setNamaWartegOnline(String namaWartegOnline){
        this.namaWartegOnline = namaWartegOnline;
    }
    public void tampilBuah(){
        System.out.println("Menyediakan berbagai macam paket nasi");
        super.namaMenu();
    }
    public void hitungHarga(){
        int pilihan;
        
        System.out.println("Masukan menu pilihan anda : ");
       
    }
}
