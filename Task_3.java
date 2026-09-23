import java.util.*;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxProfit = sc.nextInt();
        int currentProfit = maxProfit;

        for (int i = 1; i < n; i++) {
            int profit = sc.nextInt();

            currentProfit = Math.max(profit, currentProfit + profit);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        System.out.println(maxProfit);

        sc.close();
    }
}
Sample Input
8
-2 -3 4 -1 -2 1 5 -3
Sample Output
7
