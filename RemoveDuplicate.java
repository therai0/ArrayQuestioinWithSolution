public class RemoveDuplicate {

    public static void main(String arg[]) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4 };
        int uniquePositoin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[uniquePositoin] != arr[i] && arr[uniquePositoin] < arr[i]) {
                arr[uniquePositoin + 1] = arr[i];
                uniquePositoin++;
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        int sortNum = 1;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                sortNum++;
            }
            else {
                break;
            }
        }
        System.out.println();
        System.out.println("Number of sorted elemnet in array is:" +sortNum);
    }
}
