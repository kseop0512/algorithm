import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] count = new int[10001];

        for(int i = 0; i < n; i++){

            int idx = Integer.parseInt(br.readLine());
            count[idx]++;
        }

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                if (count[i] > 0) {
                    sb.append(i).append("\n");
                } else {
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}