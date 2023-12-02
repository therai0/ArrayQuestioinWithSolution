class Largest {
    public static void main(String arg[]) {
        int[] arr = { 12, 34, 5, 5, 67, 7 };
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("Largest element is: " +large);
    }
}