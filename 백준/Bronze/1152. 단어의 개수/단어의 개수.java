import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int result = 0;
        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].equals("")) {
                result++;
            }
        }

        System.out.println(result);
    }
}
