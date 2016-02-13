import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 1/25/16.
 */
public class Main {
    static int arr[];
    static int MAX;
    static int[][]dp;

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        MAX = in.nextInt();
        arr = new int[MAX];
        dp=new int[MAX+1][MAX+1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        for (int i = 0; i < MAX; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solve(0, MAX-1));
    }


    public static int solve(int i, int j) {
        if (i == MAX || j < 0 || j < i) return 0;
        if (i == j) return (arr[i] == 0 ? 1 : 0);

        if(dp[i][j]!=-1)return dp[i][j];

        return dp[i][j]=Math.max(Math.max(count(i, j), solve(i + 1, j)), solve(i, j - 1));
    }

    public static int count(int i, int j) {
        int count = 0;
        for (int k = 0; k <i ; k++) {
            if (arr[k] == 1) count++;
        }
        for (int k = i; k <= j; k++) {
            if (arr[k] == 0) count++;
        }
        for (int k = j; k <MAX ; k++) {
            if (arr[k] == 1) count++;
        }

        return count;
    }
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

}
