import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 2/12/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        int x=0,y=0;
        out:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(in.nextInt()==1){
                    x=i;
                    y = j;
                    break out;
                }
            }
        }
        System.out.println(Math.abs(x-2)+Math.abs(y-2));

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
