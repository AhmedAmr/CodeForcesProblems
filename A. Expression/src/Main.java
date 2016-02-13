import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 2/13/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int c = in.nextInt();
            list.add(c);
        }
        int path1 = list.get(0)+list.get(1)+list.get(2);
        int path2 = list.get(0)+list.get(1)*list.get(2);
        int path3 = list.get(0)*list.get(1)+list.get(2);
        int path4 = (list.get(0)+list.get(1))*list.get(2);
        int path5 = list.get(0)*(list.get(1)+list.get(2));
        int path6 = list.get(0)*(list.get(1)*list.get(2));

        list.clear();
        list.add(path1);
        list.add(path2);
        list.add(path3);
        list.add(path4);
        list.add(path5);
        list.add(path6);

        System.out.println(Collections.max(list));
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
