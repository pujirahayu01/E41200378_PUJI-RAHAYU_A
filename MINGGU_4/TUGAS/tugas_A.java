
package Tugas_Mg4;

import java.util.Scanner;

public class tugas_A {
    public static void main(String[] args){
        int batasAtas ;
        int batasBawah ;
        
      Scanner scan = new Scanner(System.in);
        System.out.println("masukkan angka batas atas : ");
            batasAtas = scan.nextInt();
         System.out.println("masukkan angka batas bawah : ");  
            batasBawah = scan.nextInt();
             
             
             System.out.println("ANGKA GENAP ADALAH SEBAGAI BERIKUT : ");
             for (int i = batasAtas; i<= batasBawah; i += 1){
                  int bilgenap = i%2;
                  if (bilgenap == 0)
                 System.out.print(i + "  ");
             }
             }
    }

