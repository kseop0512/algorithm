
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int i = 2;
        while (true){
           
            if (n % i == 0) {
                System.out.println(i);
                n /= i;

                if (n == i) {
                    System.out.println(i);
                    break;
                }
               
            } else {
                if (n <= i) {
                    break;
                }
                i++;
            }

        }

    }
}