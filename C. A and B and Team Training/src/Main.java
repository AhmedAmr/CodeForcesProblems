import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AhmedAmr on 12/30/15.
 */
public class Main {
    static int m;
    static int n;
    static int res=0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));
        m = line.get(0);
        n = line.get(1);
        while(solve()){
        }
        System.out.println(res);
    }
    //return true if changes made
    //false if no changes made
    public static boolean solve(){
        if(m==0||n==0)return false;
        if(n==1&&m==1)return false;
        if(m>n) {
            m -= 2;
            n--;
        }else{
            n-=2;
            m--;
        }
        res++;
        return true;
    }

    public static ArrayList<Integer> readInts(String line) {
        String[] arr = line.split(" ");
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) res.add(Integer.parseInt(s));
        }
        return res;
    }

    public static ArrayList<String> readStrings(String line) {
        String[] arr = line.split(" ");
        ArrayList<String> res = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) res.add(s);
        }
        return res;
    }

    public static String nextReadyLine(BufferedReader in) throws IOException {
        if (!in.ready()) return null;
        String line = in.readLine();
        while (line.isEmpty()) {
            if (!in.ready())
                break;
            line = in.readLine();
        }
        return line;
    }

    public static String nextLine(BufferedReader in) throws IOException {
        String line = in.readLine();
        while (line.isEmpty()) {
            line = in.readLine();
        }
        return line;
    }

}
