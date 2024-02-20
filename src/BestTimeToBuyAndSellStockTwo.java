public class BestTimeToBuyAndSellStockTwo {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int result=maxProfit(prices);
        System.out.println("Output : "+result);
    }
    public static int maxProfit(int[] prices) {
        int hold = -Integer.MAX_VALUE, notHold = 0;
        for( int stockPrice : prices ){
            int prevHold = hold, prevNotHold = notHold;
            hold = Math.max(prevHold, prevNotHold - stockPrice);
            notHold = Math.max(prevNotHold, prevHold + stockPrice);
        }
        return notHold;
    }
}