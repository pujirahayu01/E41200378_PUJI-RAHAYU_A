
package latihanmg_2;

import java.util.Scanner;

public class latihan_2A {

    public static void main(String[] args) {
        
        //membuat variabel dan nama scanner
      int nilai;
      String grade;
      Scanner scan = new Scanner(System.in);
        
        // mengambil inputan
      System.out.print("Masukkan nilai : ");
      nilai = scan.nextInt();

        // menghitung grade nilai menggunakan if 
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B-";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        // mencetak hasilnya
              System.out.println("Grade : " + grade);

    }

}
