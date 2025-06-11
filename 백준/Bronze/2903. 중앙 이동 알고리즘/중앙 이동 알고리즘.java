
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int point = 2;
        Integer result = 0;

        for (int i = 0; i < cnt; i++) {
            point = (point + (point - 1));
        }

        result = point * point;
        System.out.println(result);

    }


}


