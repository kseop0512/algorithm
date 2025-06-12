import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();
            int q = Integer.parseInt(num);
            if (q < 2) {
                break;
            }

            String resultStr = "is NOT perfect.";

            int sum = 1;
            int cnt = 1;

            ArrayList<Integer> resultList = new ArrayList<>();
            resultList.add(cnt);
            while(true){
                cnt++;
                if (cnt > q / 2) {
                    break;
                }
                if (q % cnt == 0) {
                    sum += cnt;
                    resultList.add(cnt);
                }

                if (sum > q) {
                    System.out.print(q + " " + resultStr);
                    break;
                }
            }

            if (q == sum) {
                System.out.print(q + " = 1");
                for (int i = 1; i < resultList.size(); i++) {
                    System.out.print(" + " + resultList.get(i));
                }
            } else if (sum < q) {
                System.out.print(q + " " + resultStr);
            }

            System.out.print("\n");
        }

    }

}