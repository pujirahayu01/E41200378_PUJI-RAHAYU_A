package Tugas_Mg4;

import java.util.Scanner;

public class tugas_C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     // buat variabelnya
        int input;
        int n_max = 0;
        int n_min = 0;
        float rata_rata;
        int i;
        
     // buat inputan dari keyboard
        System.out.print("Masukkan banyaknya data nilai : ");
        input = scan.nextInt();

        int[] array = new int[input];

        for (i = 0; i < array.length; i++) {
            System.out.print("Masukkan data nilai ke - " + (i + 1) + "  :  ");
            array[i] = scan.nextInt();
        }
    // mencari nilai maximum
        n_max = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] > n_max) {
                n_max = array[i];
            }
        }
        
    // mencari nilai minimum
        n_min = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] < n_min) {
                n_min = array[i];
            }
        }
        System.out.print("nilai min   :   " + n_min + "   " + "\n");
        System.out.print("nilai max   :   " + n_max + "  " + "\n");
        int jumlah_data = 0;
    
    // membuat rata-rata dari nilai array yang di inputkan
        // angka sama dengan array. dan jumlah data adalah hasil penjumlahan semua value array
        for (int angka : array) {
            jumlah_data = jumlah_data + angka;
        }

        rata_rata = jumlah_data / array.length;
        System.out.println("JADI, HASIL RATA - RATANYA ADALAH " + rata_rata);

    }
}
