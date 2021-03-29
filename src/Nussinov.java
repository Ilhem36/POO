public class Nussinov {

    private static int dp[][];
    private static String sequence;

    private Nussinov(String inputSequence) {

        sequence = inputSequence;
        int N = sequence.toCharArray().length;
        dp = new int[N][N];

        // Initialize DP matrix
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                dp[i][j] = -1;
    }