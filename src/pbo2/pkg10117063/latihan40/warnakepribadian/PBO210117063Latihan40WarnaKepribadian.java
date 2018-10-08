/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan40.warnakepribadian;

import java.util.Scanner;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan warna kepribadian berdasarkan (OO)
 */
public class PBO210117063Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wrnMu;
        String namMu;
        Scanner scn = new Scanner(System.in);
        warna wrn = new warna();
        
//        teksnya
        System.out.print(wrn.ANSI_RED+"YUK "+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_GREEN+"CEK "+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_YELLOW+"KEPRIBADIANMU "+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_CYAN+"DARI "+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_PURPLE+"WARNA "+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_BLUE+"FAVORITMU "+wrn.ANSI_RESET+"\n");
        
//        teks + backgroundnya
        System.out.print("\n"+wrn.ANSI_RED_BACKGROUND+wrn.ANSI_WHITE+"\t KUNING\t\t\n"+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_GREEN_BACKGROUND+wrn.ANSI_WHITE+"\t MERAH \t\t\n"+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_YELLOW_BACKGROUND+wrn.ANSI_WHITE+"\t HIJAU \t\t\n"+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_BLUE_BACKGROUND+wrn.ANSI_WHITE+"\t UNGU \t\t\n"+wrn.ANSI_RESET);
        System.out.print(wrn.ANSI_PURPLE_BACKGROUND+wrn.ANSI_WHITE+"\t BIRU \t\t\n\n"+wrn.ANSI_RESET);
        
//        input
        System.out.print("PILIH WARNA FAVORITMU : ");
        wrnMu = scn.next();
        System.out.print("NAMA KAMU : ");
        namMu = scn.next();
        
//      hasil  
        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namMu.toUpperCase()+"====");
        wrn.Hasiltest(wrnMu);
    }
    
}
