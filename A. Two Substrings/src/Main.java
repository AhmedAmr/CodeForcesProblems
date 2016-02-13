import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 1/25/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        String s = in.next();

        int n = s.length();
        boolean found = false;
        if(s.contains("AB")) {
            String l = s.replaceFirst("AB", ".");
            if(l.contains("BA")){
                found=true;
            }
        }
        if(!found){
            if(s.contains("BA")){
                String l = s.replaceFirst("BA", ".");
                if(l.contains("AB")){
                    found=true;
                }
            }
        }
        if(found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
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
