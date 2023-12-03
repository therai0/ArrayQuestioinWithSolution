public class SortedOrNode {
    static boolean isSorted(int[] arr) {
        int len = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                len++;
            } else {

            }
        }
        if(len == arr.length)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String arg[]) {
        int[] arr = { 1, 2,1, 3, 4, 5, 6, 7 };
        System.out.println(isSorted(arr));
    }
}
