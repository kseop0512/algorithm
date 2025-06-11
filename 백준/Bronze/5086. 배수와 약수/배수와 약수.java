import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;

            String result = "";
            if (a % b == 0) {
              result = "multiple";
            } else if (b % a == 0) {
                result = "factor";
            } else  {
                result = "neither";
            }

            System.out.println(result);

        }

        br.close();

    }

}