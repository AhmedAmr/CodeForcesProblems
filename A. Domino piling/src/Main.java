import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AhmedAmr on 12/30/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));
        int m = line.get(0);
        int n = line.get(1);
        if(n%2!=0&&m%2!=0){
            int path1 = (int)(((m-1)*n)*1.0/2)+(int)Math.floor(n*1.0/2);
            int path2 = (int)(((n-1)*m)*1.0/2)+(int)Math.floor(m*1.0/2);
            System.out.println(Math.max(path1,path2));
        }else{
            System.out.println((m*n)/2);
        }
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
