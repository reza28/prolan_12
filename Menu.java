package wartegonline;

import wartegonline.Hargamenu;


public class Menu extends Hargamenu {

    public void namaMenu(){
        System.out.println("1. nasi kumplit");
        System.out.println("2. nasi spesial");
        System.out.println("3. nasi irit");
    }
    public void harga(){
        super.setHargaMenu(20000);
    }
}
