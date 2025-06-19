import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] resultArr = new int[n];
        for (int i = 0; i < n; i++) {
             int a = Integer.parseInt(br.readLine());

            resultArr[i] = a;
        }

        Arrays.sort(resultArr);

        for (int i = 0; i < n; i++) {
            System.out.println(resultArr[i]);
        }

    }
}