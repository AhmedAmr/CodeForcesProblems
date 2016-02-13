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
        int s = in.nextInt();
        int n = in.nextInt();
        ArrayList<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Node(in.nextInt(),in.nextInt()));
        }
        Collections.sort(list);

        for (int i = 0; i <n ; i++) {
            if(s>list.get(i).power){
                s+=list.get(i).gain;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
class Node implements Comparable<Node>{
    int power;
    int gain;

    public Node(int power, int gain) {
        this.power = power;
        this.gain = gain;
    }

    @Override
    public int compareTo(Node o) {
        if(this.power<o.power)return -1;
        if(this.power>o.power)return 1;
        return 0;
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
