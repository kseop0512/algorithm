import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;
        int center = 2;
        int sum = 0;

        int[] resultArr = new int[n];

        for (int i = 0; i < n; i++) {
             int a = Integer.parseInt(br.readLine());
            resultArr[i] = a;
        }

        Arrays.sort(resultArr);

        for (int i = 0; i < n; i++) {
            sum += resultArr[i];
        }

        System.out.println(sum/n);
        System.out.println(resultArr[center]);

    }
}