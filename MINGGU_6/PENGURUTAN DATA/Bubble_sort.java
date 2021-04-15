package minggu_6;

public class Bubble_sort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // n adalah indeks
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
               System.out.println("A : " + arr[j-1] + " >" + " B : " +arr[j]);

                if (arr[j - 1] > arr[j]) {

                    // swap element dari array
                    temp = arr[j - 1];
                    //menggunakan var sementara
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {3,60,35,2,45 };

        System.out.println("Array Sebelum Diurutkan dengan Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr); // setelah di sorting menggunakan buble sort
        System.out.println("Array Setelah Di urutkan dengan Bubble Sort");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
