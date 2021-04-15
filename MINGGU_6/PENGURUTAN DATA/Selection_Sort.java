package minggu_6;

public class Selection_Sort {

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                    // mencari index yang kecil  
                }
            }
            int SmallNumber = array[index];
            array[index] = array[i];
            array[i] = SmallNumber;
            System.out.println(" nilai terkecil yang di temukan  : " + array[i]);
        }
    }

    public static void main(String[] args) {
        boolean tukar = false;
        int count = 0;
        int[] array1 = {3,60,35,2,45};
        System.out.println("Sebelum di urutkan dengan Selection Sort");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        SelectionSort(array1); // ketika array di swap

       

        System.out.println("Setelah di urutkan menggunakan Selection Sort");
        for (int i : array1) {
            System.out.print(i + " ");
            tukar = true;
            if (tukar) {
                count++;
            }
        }
        System.out.println(" ");
        System.out.println(" banyaknya swap pada data  : " + count);
    }
}
