import java.util.Arrays;

public class FirstAndLastOccurrence {

    static int first(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    static int last(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(new int[]{first(arr,8), last(arr,8)}));
    }
}