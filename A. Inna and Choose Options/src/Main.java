import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by AhmedAmr on 1/29/16.
 */
public class Main {
    static int bs[] = {1,2,3,4,6,12};
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(System.in);
        int n = in.nextInt();
        Comparator<String>comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int term1 = Integer.parseInt(o1.split("x")[0]);
                int term2 = Integer.parseInt(o2.split("x")[0]);
                if(term1<term2)return -1;
                if(term2<term1)return 1;
                return 0;
            }
        };
        for (int i = 0; i < n; i++) {
            ArrayList<String> res = new ArrayList<>();
            char[] arr = in.next().toCharArray();
            for (int j = 0; j < 6; j++) {
                if(can(bs[j],arr)){
                    res.add(12/bs[j]+"x"+bs[j]);
                }
            }
            Collections.sort(res,comp);
            int size = res.size();
            System.out.print(size);
            for (int k = 0; k < size; k++) {
                System.out.print(" " + res.get(k));
            }
            System.out.println();
        }


    }

    public static boolean can(int b , char[]arr){
        int a = 12/b;
        for (int i = 0; i < b; i++) {
            boolean isFound = true;
            int start = i;
            for (int j = 0; j < a; j++) {
                isFound&=arr[start]=='X';
                start+=b;
            }
            if(isFound)return true;
        }
        return false;
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
