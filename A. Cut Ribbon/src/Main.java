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
    static int arr[] = new int[3];
    static int dp[];
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        int n = in.nextInt();
        dp= new int[n+1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n<0)return Integer.MIN_VALUE;
        if(n==0)return 0;

        if(dp[n]!=-1)return dp[n];

        int path1 = 1+solve(n-arr[0]);
        int path2 = 1+solve(n-arr[1]);
        int path3 = 1+solve(n-arr[2]);
        return dp[n]=Math.max(Math.max(path1,path2),path3);
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
