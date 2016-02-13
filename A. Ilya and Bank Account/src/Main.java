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
        int x = in.nextInt();
        if(x>0){
            System.out.println(x);
            return;
        }
        int base = x/100;
        int num1 = x%10;
        int num2 = (x/10)%10;
        num1 = base*10+num1;
        num2 = base*10+num2;
        System.out.println(Math.max(num1, num2));

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
