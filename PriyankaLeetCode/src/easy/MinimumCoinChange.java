package easy;

public class MinimumCoinChange {
	
	public static int findMinCoins(int[] S, int target)
    {
        
    // if the total is 0, no coins are needed
    if (target == 0) {
        return 0;
    }

    // return infinity if total becomes negative
    if (target < 0) {
        return Integer.MAX_VALUE;
    }

    // initialize the minimum number of coins needed to infinity
    int coins = Integer.MAX_VALUE;

    // do for each coin
    for (int c: S)
    {
        // recur to see if total can be reached by including current coin `c`
        int result = findMinCoins(S, target - c);

        // update the minimum number of coins needed if choosing the current
        // coin resulted in a solution
        if (result != Integer.MAX_VALUE) {
            coins = Integer.min(coins, result + 1);
        }
    }

    // return the minimum number of coins needed
    return coins;
}

public static void main(String[] args)
{
    // coins of given denominations
    int[] S = { 1, 3, 5, 7 };

    // total change required
    int target = 18;

    int coins = findMinCoins(S, target);
    if (coins != Integer.MAX_VALUE)
    {
        System.out.print("The minimum number of coins required to get the " +
                "desired change is " + coins);
    }
}
}





