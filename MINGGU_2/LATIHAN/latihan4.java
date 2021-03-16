package latihan;

import java.util.Scanner;

public class latihan4 {

    public static void main(String[] args) {
        // buat nama scannernya
        Scanner scan = new Scanner(System.in);

        // masukkan nilai dari keyboard
        System.out.print(" masukkan nilai1 =");
        int nilai1 = scan.nextInt();
        System.out.print(" masukkan nilai 2 =");
        int nilai2 = scan.nextInt();
        // hitung jumlah nilai1 dan nilai2

        int jumlah = nilai1 + nilai2;
        System.out.print("Hasil = " + jumlah);
    }
}
