import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 1/24/16.
 */
public class Main {
    static long [] arr;
    static int MAX;
    static long dp[];
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        MAX = in.nextInt();
        arr = new long[100001];
        dp = new long [100001];
        for (int i = 1; i <=MAX; i++) {
            arr[in.nextInt()]++ ;
        }
        Arrays.fill(dp, -1);
        System.out.println(solve(100000));



    }

    public static long solve(int i){

        if(i==1)return dp[i]=arr[1];
        if(i==0)return dp[i]=0;

        if(dp[i]!=-1)return dp[i];
        long temp = (arr[i]*i);
        long path2 = solve(i-2);
        long path1 = solve(i-1);

        dp[i]=Math.max(path1,path2+temp);
        return dp[i];
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

}
