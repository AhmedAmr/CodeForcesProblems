import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by AhmedAmr on 12/30/15.
 */
public class Main {
   static int[]count = new int[5];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> line = readInts(nextLine(in));

        line = readInts(nextLine(in));
        for (Integer integer : line) {
            count[integer]++;
        }
        int res=count[4];

        for (int i = 3; i > 0 ; i--) {
            while(count[i]!=0){
                solve(i,4);
                res++;
            }
        }

        System.out.println(res);
    }

    public static void solve(int start,int rem){
        if(start==0||rem==0)return;

        if(count[start]>0&&((rem-start)>=0)){
            count[start]--;
            solve(start,rem-start);
        }else{
            solve(start-1,rem);
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
