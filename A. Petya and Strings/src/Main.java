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
        String s1 = in.readLine().toLowerCase();
        String s2 = in.readLine().toLowerCase();
        int res = s1.compareTo(s2);
        if(res<0)
            System.out.println(-1);
        else if(res>0){
            System.out.println(1);
        }else{
            System.out.println(0);;
        }
    }


}
