import java.util.Arrays;

public class ScenarioQuestion1 {

    // Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Search in Rotated Sorted Array
    static int searchRotated(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            } else {

                if (target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    static int firstOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    // Last Occurrence
    static int lastOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    // Find Minimum
    static int findMinimum(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] sorted = {2,4,6,8,10,12,14};

        System.out.println("Binary Search : " + binarySearch(sorted,10));

        int[] rotated = {8,10,12,14,2,4,6};

        System.out.println("Rotated Search : " + searchRotated(rotated,4));

        int[] repeated = {1,2,2,2,3,4,5};

        System.out.println("First Occurrence : " + firstOccurrence(repeated,2));
        System.out.println("Last Occurrence : " + lastOccurrence(repeated,2));

        System.out.println("Minimum Element : " + findMinimum(rotated));
    }
}