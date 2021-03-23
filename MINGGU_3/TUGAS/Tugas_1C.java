
package TUGAS_MG3;

public class Tugas_1C {
    public static void main(String[] args) {
        int[][] array = {{5, 6, 1, 7}, {8, 1, 2, 9}, {5, 4, 7, 1}, {8, 3, 7, 5}};

        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(array[baris][kolom] + " ");
            }
            System.out.println("");
        }

    }
}
