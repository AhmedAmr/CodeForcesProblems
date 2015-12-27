import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by AhmedAmr on 12/26/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));
        int n  = line.get(0);
        line = readInts(nextLine(in));
        Collections.sort(line, Comparator.<Integer>reverseOrder());
        int res = 1;
        int current = line.get(0);
        int rem = -1*current;

        for (Integer integer : line) {
            rem += integer;
        }
        for (int i = 1; i < n; i++) {
            if(current>rem)break;
            res++;
            rem-=line.get(i);
            current+=line.get(i);
        }

        System.out.println(res);


    }

    public static ArrayList<Integer> readInts(String line) {
        String[] arr = line.split(" ");
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) res.add(Integer.parseInt(s));
        }
        return res;
    }

    public static String nextLine(BufferedReader in) throws IOException {
        String line = in.readLine();
        while (line.isEmpty()) {
            line = in.readLine();
        }
        return line;
    }

}
