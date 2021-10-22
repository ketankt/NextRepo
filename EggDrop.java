public class EggDrop {
    //Solution of https://leetcode.com/problems/super-egg-drop/
    public int superEggDrop(int K, int N) {
        int[] dp = new int[K + 1];
        int m = 2;
        if (N == 1)
            return 1;
        if (K == 1)
            return N;
        for (int i = 0; i <= K; i++) {
            if (i == 0)
                dp[i] = 0;
            else
                dp[i] = 1;
        }
        while (true) {
            int prev = m - 1;
            dp[1] = m;
            for (int j = 2; j <= K; j++) {
                int prev2 = dp[j];
                dp[j] = prev + prev2 + 1;
                prev = prev2;
                if (dp[j] >= N && j == K)
                    return m;
            }
            m++;
        }
    }
}

