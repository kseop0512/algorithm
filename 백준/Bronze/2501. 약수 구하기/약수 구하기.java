import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk = br.readLine();

        int num = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        int cnt = 0;
        List<Integer> kList = new ArrayList<>();
        while (true) {
            cnt++;

            if (cnt > num) {
                break;
            }
            if (num % cnt == 0) {
                kList.add(cnt);
            }
        }

        int result = 0;
        if (kList.size() >= k) {
            result = kList.get(k - 1);
        }
        System.out.println(result);

    }

}