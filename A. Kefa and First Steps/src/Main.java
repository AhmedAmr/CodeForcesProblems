import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AhmedAmr on 1/21/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));
        int n = line.get(0);
         line = readInts(nextLine(in));
        System.out.println(max(line, n));

    }

    public static int max(ArrayList<Integer>list,int sz) {
        int last = list.get(0);
        int count = 1;
        int res = 1;
        for (int i = 1; i < sz; i++) {
            if(list.get(i)>=last){
                count++;
                last = list.get(i);
             if(count>res)res=count;
            }
            else{
                count=1;
                last = list.get(i);
            }
        }
        return res;
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
