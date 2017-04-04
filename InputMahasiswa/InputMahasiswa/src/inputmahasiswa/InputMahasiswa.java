/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmahasiswa;

/**
 *
 * @author reza
 */
/*InputMahasiswa*/
import java.util.Scanner;
public class InputMahasiswa
{
public static void main(String []args){
	Scanner InputMahasiswa = new Scanner(System.in);
	String mahasiswa;
	
        System.out.println("Tulis Nama Mahasiswa : ") ;
	mahasiswa = InputMahasiswa.nextLine();
	
	System.out.println("Nama mahasiswa : " + mahasiswa) ;
        
	}
}
