import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];
        System.out.println("The second largest number is: " + secondLargest);
    }
}
