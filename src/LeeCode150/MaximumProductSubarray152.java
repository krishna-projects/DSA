package LeeCode150;

public class MaximumProductSubarray152 {

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int result = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxProd == 0)
                maxProd = 1;
            if (minProd == 0)
                minProd = 1;

            minProd *= Math.min(minProd, minProd * nums[i]);
            maxProd *= Math.max(maxProd, maxProd * nums[i]);

            result = Math.max(result, Math.max(maxProd, minProd));
        }
        return result;
    }
}
