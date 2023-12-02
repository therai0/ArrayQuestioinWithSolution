public class SecondLargest {

    public static void main(String aar[]) {
        int[] arr = { 12, 34, 4, 5,50, 65, 7, 8 };
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        int secondLarge = 0;
        for (int i = 0; i < arr.length; i++) {
            if (secondLarge < arr[i] && arr[i] < large) {
                secondLarge = arr[i];
            }
        }
        System.out.println("Second largest element:" + secondLarge);
    }
}
