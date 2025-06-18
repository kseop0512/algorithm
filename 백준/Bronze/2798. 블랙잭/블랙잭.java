import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] qArr = br.readLine().split(" ");
        int m = Integer.parseInt(qArr[1]);

        String[] nArr = br.readLine().split(" ");
        int leng = nArr.length;
        int result = 0;
        ArrayList<Integer> sumList = new ArrayList<>();

        outerLoop:
        for (int i = 0; i < leng; i++) {
            for (int j = i + 1; j < leng; j++) {
                for (int k = j + 1; k < leng; k++) {
                    int sum = Integer.parseInt(nArr[i]) + Integer.parseInt(nArr[j]) + Integer.parseInt(nArr[k]);
                    if (sum <= m) {
                        sumList.add(sum);
                    }
                    if(sum == m) break outerLoop;

                }
            }

        }

        Collections.sort(sumList);
        result = sumList.get(sumList.size() - 1);

        System.out.println(result);
    }
}