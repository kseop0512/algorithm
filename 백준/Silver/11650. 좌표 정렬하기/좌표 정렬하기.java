import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] nArr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String q = br.readLine();
            String[] qArr = q.split(" ");
            int x = Integer.parseInt(qArr[0]);
            int y = Integer.parseInt(qArr[1]);

            nArr[i][0] = x;
            nArr[i][1] = y;
        }


        Arrays.sort(nArr, (a, b) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[0], b[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String appStr = nArr[i][0] + " " + nArr[i][1] + "\n";
            sb.append(appStr);
        }

        System.out.print(sb);

    }
}