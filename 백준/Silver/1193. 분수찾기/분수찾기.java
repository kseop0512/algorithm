import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.parseInt(br.readLine());

        int cnt = 1;

        while (num > cnt) {
            num = num - cnt;
            cnt++;
        }

        if(cnt%2==0){
            System.out.println(num + "/" + (cnt - num + 1));
        } else {
            System.out.println((cnt - num + 1)  + "/" + num);
        }

    }

}