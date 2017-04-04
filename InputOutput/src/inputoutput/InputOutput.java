/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

/**
 *
 * @author reza
 */
/*program ke-3*/
import java.util.Scanner;
public class InputOutput
{
public static void main(String []args){
	Scanner input = new Scanner (System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean kawin; 
        /*membuat variable menikah tipe data boolean*/
		System.out.println("masukan Nama : ");
		nama	= input.nextLine();
	
		System.out.println("masukan Jenis Kelamin : ");
		jenisKelamin	= input.nextLine().charAt(0);
	
		System.out.println("masukan Tinggi Badan : ");
		tinggiBadan	= input.nextInt();
	 
                /*memberikan nilai benar/true pada boolean menikah*/
                kawin = true;
                System.out.println("masukan Status : ");
                kawin	= input.nextBoolean();
		/*statemen jika benar*/
                
                if (kawin){
                System.out.println("LAKU");
                }
                /*statemen jika salah*/
                if (!kawin){
                System.out.println("Gak LAKU");
                }
		    
                
	
	
	}
}
