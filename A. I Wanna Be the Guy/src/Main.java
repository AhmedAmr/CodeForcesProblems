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
        line = readInts(nextLine(in));
        ArrayList<Integer> list = readInts(nextLine(in));
        line.remove(0);
        list.remove(0);
        line.addAll(list);
        Collections.sort(line);
        int size = line.size();
        int current = 1;
        for (int i = 0; i <size; i++) {
            if(line.get(i)==current){
                current++;
            }else if(line.get(i)>current)break;
        }
        if(current==n+1){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
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
