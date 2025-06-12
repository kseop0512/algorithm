import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> decimalArr = new ArrayList<Integer>();

        while (true){

            if (m > n) {
                break;
            }

            int c = 1;
            
            while(true) {
                c++;
                if (m <= 1) {
                    break;
                }

                if (c > m / 2) {
                    decimalArr.add(m);
                    break;
                }

                if (m % c == 0) {
                    if (c > 1) {
                        break;
                    }
                }

            }
            m++;
        }

        int sum = 0;

        for (Integer decimal : decimalArr) {
            sum += decimal;
        }

        if (decimalArr.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(decimalArr.get(0));
        }


    }

}