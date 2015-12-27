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
        String line = in.readLine();
        char[] arr = line.toCharArray();
        char[] hello = "hello".toCharArray();
        int helloIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==hello[helloIdx]){
                helloIdx++;
            }
            if(helloIdx == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }



}
