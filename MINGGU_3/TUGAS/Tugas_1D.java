
package TUGAS_MG3;

import java.util.Scanner;
public class Tugas_1D {
    public static void main(String[] args){
        
        System.out.println("----------------------------------------------------");
        System.out.println("Kharisma Agung Plaza (KAP)");
        System.out.println("  Promo Belanja Berhadiah");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println(" Dengan harga minimum Rp 10000,00");
        System.out.println("----------------------------------------------------");
        
    String nama;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Nama Pembeli :");
    nama = scan.nextLine();
    
    int barang1, barang2, barang3, barang4, barang5;
    System.out.print("Masukkan harga barang ke 1 : ");
    barang1 = scan.nextInt();
    System.out.print("Masukkan harga barang ke 2 : ");
    barang2 = scan.nextInt();
    System.out.print("Masukkan harga barang ke 3 : ");
    barang3 = scan.nextInt();
    System.out.print("Masukkan harga barang ke 4 : ");
    barang4 = scan.nextInt();
     System.out.print("Masukkan harga barang ke 5 : ");
    barang5 = scan.nextInt();
    
    int sum ;
    sum = barang1 + barang2 + barang3 + barang4 + barang5;
    
    System.out.println("Total pembelian atas nama " + nama + " adalah :"+sum);
    
    if(sum >= 50000){
    System.out.println("Selamat....");
     System.out.println( "Anda medapat hadiah 1 buah mug cantik ");}
    
    System.out.println("-------------------------------------------------------- ");
    
    System.out.println("          TERIMAKASIH ");
    System.out.println (" Anda telah berbelanja di Kharisma Agung Plaza");
    
    }
}
