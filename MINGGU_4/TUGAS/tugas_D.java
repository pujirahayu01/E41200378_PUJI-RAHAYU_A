
package Tugas_Mg4;

public class tugas_D {

    public static void main(String[] args) {
        System.out.println("                    Perulangan ");
        System.out.println("           Hasil Kali 2 (0-100) ");
        System.out.println("======================================================= ");

        int hasil;
        for (int i = 1; i <= 50; i++) {
            hasil = i * 2;

            if (hasil <= 100) {
                System.out.print(hasil + " ");
            }
        }
    }
}
