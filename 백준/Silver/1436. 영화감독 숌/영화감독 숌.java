import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int startN = 666;

        int result = 666;
        int v = 0;
        while (true) {

            if (Integer.toString(startN).contains("666")) {
                result = startN;
                v++;
            }

            startN++;
            if (v == n) {
                System.out.println(result);
                break;
            }
        }

    }

}