public class SecondLargest {

    // this is the best solution
    static void secondLargestElement() {
        int[] arr = { 12, 34, 4, 5, 50,55, 65, 7, 8 };
        int largest = arr[0];
        int secondLargeset = -1; // let assume that there is no negative number in array
        for(int i = 0; i < arr.length; i++)
        {
            if(largest < arr[i])
            {
                secondLargeset = largest;
                largest = arr[i]; 
            } else {
                if(secondLargeset < arr[i] && largest > arr[i])
                {
                    secondLargeset = arr[i];
                }
            }
        }
        System.out.println("Second largest element is: " + secondLargeset);
    }

    public static void main(String aar[]) {
        int[] arr = { 12, 34, 4, 5, 50, 55,65, 7, 8 };
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
        // System.out.println("Second largest element:" + secondLarge);
        secondLargestElement();
    }
}
