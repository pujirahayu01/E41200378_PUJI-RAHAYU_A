package Tugas_Mg4;

public class tugas_B {

    public static void main(String[] args) {
        System.out.println("                    DO WHILE ");
        System.out.println("           Hasil Kelipatan 2 (1-100) ");
        System.out.println("======================================================= ");

        int i = 1;
        int batas = 6;
        int kelipatan = 2;
        do {
            System.out.print(kelipatan + " ");
            kelipatan *= 2;
            i++;
        } while (i <= batas);
    }

}