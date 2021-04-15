
package minggu_6;
// logika
//1. bandingkan dulu 2 items
// 2. jika kanan lebih besar dari kiri, maka tukar
// 3. pindah posisi sebelah kanan yang di bandingkan
//4. lakukan iterasi untuk yg terakhir

public class Bubble_Descending {
    static void BubbleDescending(int[] array){
         int n = array.length;
        // n adalah indeks
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.println("A : " + array[j-1] + " >" + " B : " +array[j]);

                if (array[j - 1] < array[j]) {

                    // swap element dari array
                    temp = array[j - 1];
                    //menggunakan var sementara
                    array[j- 1 ] = array[j ];
                    array[j] = temp;
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

        BubbleDescending(arr); // setelah di sorting menggunakan buble sort
        System.out.println("Array Setelah Di urutkan dengan Bubble Sort");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    
}
