public class SecondSmallest {
    public static void main(String arg[]) {
        int[] arr = { 12, 34, 4, 5, 50, 55, 65, 7, 8 };
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest < arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else {
                if (smallest != arr[i] && arr[i] < secondSmallest) {
                    secondSmallest = arr[i];
                }
            }
        }
        System.out.println("Second smallest element is:" + secondSmallest);
    }
}
