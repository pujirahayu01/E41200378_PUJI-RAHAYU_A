
package minggu_6;

public class Binary_search {

    int binarySearch(int array[], int l, int r, int x) {
        if (r >= l) {
            int midle = l + (r - l) / 2;

            if (array[midle] == x) {
                return midle;
            }

            if (array[midle] > x) {
                return binarySearch(array, l, midle - 1, x);
            }
            return binarySearch(array, midle + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        Binary_search ob = new Binary_search();
        int array[] = {3, 60, 35, 2, 45};
        int index = array.length;
        int target = 35;
        int result = ob.binarySearch(array, 0, index - 1, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element ditemukan pada index ke - " + result);
        }
    }
}

