package LeeCode150;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}
