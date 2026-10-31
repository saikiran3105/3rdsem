public class BestSingleTradeProfit {
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] first = {7, 1, 5, 3, 6, 4};
        int[] second = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(first));
        System.out.println(maxProfit(second));
    }
}
