import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 2/13/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            x += in.nextInt();
            y += in.nextInt();
            z += in.nextInt();
        }
        if(x==0&&y==0&&z==0) System.out.println("YES");
        else System.out.println("NO");
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
