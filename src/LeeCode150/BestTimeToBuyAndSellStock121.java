package LeeCode150;

public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price - min > profit) {
                profit = price - min;
            }
        }
        return profit;
    }
}
