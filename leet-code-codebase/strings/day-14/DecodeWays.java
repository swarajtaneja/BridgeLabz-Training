public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            char c = s.charAt(i - 1);
            char p = s.charAt(i - 2);

            if (c != '0') dp[i] += dp[i - 1];

            int val = (p - '0') * 10 + (c - '0');
            if (val >= 10 && val <= 26) dp[i] += dp[i - 2];
        }
        return dp[n];
    }
}
