/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reza
 */
package OKjek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("            OKjek             ");
        System.out.println("============================");
        System.out.println("1. Register as Driver");
        System.out.println("2. Register as Customer");
        System.out.println("3. Login as Driver");
        System.out.println("4. Login as Customer");
        System.out.print("Pilihan : ");
        
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        
switch(pilih) {
    case 1 :    String nomorKendaraan = sc.nextLine();
                String namaDriver = sc.nextLine();
                String emailDriver = sc.nextLine();
                String nomorTeleponDriver = sc.nextLine();
        Pengemudi(nomorKendaraan,namaDriver,emailDriver,nomorTeleponDriver);
                        
case 2 :    String alamat = sc.nextLine();
        String namaCustomer = sc.nextLine();
        String emailCustomer = sc.nextLine();
        String nomorTeleponCustomer = sc.nextLine();
        Penumpang(alamat,namaCustomer,emailCustomer,nomorTeleponCustomer);
                
            case 3 :
                
            case 4 : 
        }
        
    }

    private static void Pengemudi(String nomorKendaraan, String namaDriver,
            String emailDriver, String nomorTeleponDriver) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    private static void Penumpang(String alamat, String namaCustomer,
            String emailCustomer, String nomorTeleponCustomer) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
     
}
