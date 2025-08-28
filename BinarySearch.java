import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int x = scanner.nextInt();
        int result = -1;
        int left = 0;
        int right = n - 1;
        int mid = left + (right - left) / 2;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        while (left <= right) {
            if (arr[mid] == x) {
                result = mid;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        System.out.println(result);
    }
}