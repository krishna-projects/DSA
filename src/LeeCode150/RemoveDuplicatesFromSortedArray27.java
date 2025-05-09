package LeeCode150;

public class RemoveDuplicatesFromSortedArray27 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
