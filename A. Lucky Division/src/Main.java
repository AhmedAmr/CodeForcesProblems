import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AhmedAmr on 12/26/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list = readInts(nextLine(in));
        int input=list.get(0);
        boolean res = false;
        for (int i = 2; i <=input; i++) {
            if(input%i==0){
                if(isLucky(i)){
                    res = true;
                    break;
                }
            }
        }
        System.out.println(res?"YES":"NO");
    }
    public static boolean isLucky(int n){
        while(n>0){
            int mod = n%10;
            if(mod!=4&&mod!=7)return false;
            n/=10;
        }
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
