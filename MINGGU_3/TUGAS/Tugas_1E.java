
package TUGAS_MG3;
import java.util.Scanner;

public class Tugas_1E {
  public static void main(String[] args){
   System.out.println("         CAFE CERIA");
  System.out.println("        ANEKA MINUMAN");
  System.out.println("---------------------------------");
  System.out.println("        SPESIAL MENU : ");
  System.out.println("      1. Soft drinks");
  System.out.println("      2. Mix juice");
  System.out.println("      3. Nescafe");
  System.out.println("      4. Soda milk");
  System.out.println("      5. Tea");

  String nama;
  Scanner scan = new Scanner(System.in);
  System.out.print("Masukkan nama pembeli : ");
  nama = scan.nextLine();
  
  String pesan;
  
  System.out.print("Silahkan masukkan pilihan anda : ");
  pesan = scan.nextLine();
    switch (pesan) {
        case "1" :  
            System.out.println("Minuman yang anda pesan adalah Soft drinks");
            System.out.println("Pesanan akan segera kami antar");
            break;
        case "2" :  
            System.out.println("Minuman yang anda pesan adalah Mix juice");
            System.out.println("Pesanan akan segera kami antar");
            break;    
        case "3" :  
            System.out.println("Minuman yang anda pesan adalah Nescafe");
            System.out.println("Pesanan akan segera kami antar");
            break;
        case "4" :  
            System.out.println("Minuman yang anda pesan adalah Soda milk");
            System.out.println("Pesanan akan segera kami antar");
            break;
        case "5" :  
            System.out.println("Minuman yang anda pesan adalah Tea");
            System.out.println("Pesanan akan segera kami antar");
            break;
        default :
            System.out.println(" ");
     
    }
            System.out.println("Terimakasih " + nama +" telah berkunjung di Cafe Ceria");
  }  
}
