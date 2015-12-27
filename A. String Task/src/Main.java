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
        String line=in.readLine().toLowerCase();
        char[] s = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        int size = s.length;
        for (int i = 0; i < size; i++) {
            if(!isVowel(s[i])){
                sb.append('.');
                sb.append(s[i]);
            }
        }
        System.out.println(sb.toString());
    }

    public static boolean isVowel(char c){
        return c=='a'||c=='i'||c=='o'||c=='u'||c=='e'||c=='y';
    }

    public static ArrayList<Integer> readInts(String line) {
        String[] arr = line.split(" ");
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) res.add(Integer.parseInt(s));
        }
        return res;
    }


}
