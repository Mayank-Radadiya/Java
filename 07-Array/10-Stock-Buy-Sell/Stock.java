public class Stock {

    public static void SellBuy(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProFit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProFit = Math.max(maxProFit, profit);
            } else {
                buyPrice = price[i];
            }
        }

        System.out.println(maxProFit);

    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        SellBuy(price);
    }
}
