import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by AhmedAmr on 12/30/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));
        int n = line.get(0);
        int m = line.get(1);
        line = readInts(nextLine(in));
        Collections.sort(line);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <=m-n; i++) {
            int res = line.get(i+n-1)-line.get(i);
            if(res<min)min=res;
        }
        System.out.println(min);
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
