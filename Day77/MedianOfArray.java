package Day77;

//LeetCode Problem 4: https://leetcode.com/problems/median-of-two-sorted-arrays/
//Time: O(m + n), Space: O(m + n)

public class MedianOfArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i < m) {
            arr[k++] = nums1[i++];    
        }
        while (j < n) {
            arr[k++] = nums2[j++];    
        }

        double median = 0;
        if ((m + n) % 2 != 0) {
            median = arr[(m + n) / 2];
        } else {
            median = (arr[(m + n) / 2 - 1] + arr[(m + n) / 2]) / 2.0;
        }

        return median;
    }
}
