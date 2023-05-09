public class MergeTwoSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // purpose is to shift all element in num2 -> num1 then check result
        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < m + n; i++) {

            if (nums1[pointer1] <= nums2[pointer2]) {
                pointer2++;
            } else {

            }
        }
    }

    public static void main(String[] args) {

    }
}
