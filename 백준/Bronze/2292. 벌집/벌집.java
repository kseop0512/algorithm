
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        Integer prevNum = 1;

        while (num > prevNum) {

            prevNum = prevNum + (6 * cnt);

            cnt++;

        }

        System.out.println(cnt);
    }
    
}