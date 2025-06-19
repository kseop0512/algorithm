import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = 5;
        int b = 3;

        int result = 0;


        while (n > 0) {
            int keyN = b;
            if (n % a == 0) {
                keyN = a;
            }
            n -= keyN;

            result++;

            if (n % a == 0) {
                result += (n / a);
                n -= (a * (n / a));
            }

        }

        if (n < 0) {
            System.out.println(-1);

        } else {
            System.out.println(result);
        }
    }
}