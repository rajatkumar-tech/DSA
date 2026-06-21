public class stock {

    /*
     * you are given an array Prices where price[i] is the price of a given stock
     * the ith day you want to maximum profit by choosing a single day to buy one
     * stock
     * and choosing a different day in the future to sell that stock. Return the
     * maximum
     * profit you can achieve form this transtion if you cannot achieve any profit,
     * retrun 0;
     * 
     */

    public static int maxProfit(int price[]) {

        int minBuyStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            int minTodayPrice = price[i];

            // Condition 1: Agar aaj ka price ab tak ka sabse sasta hai, toh buy price
            // update karo
            if (minTodayPrice < minBuyStock) {
                minBuyStock = minTodayPrice;
            }
            // Condition 2: Agar aaj sasta nahi hai, toh check karo bechne par kitna profit
            // milega
            else {
                int currProfit = minTodayPrice - minBuyStock;
                maxProfit = Math.max(currProfit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));

    }
}
