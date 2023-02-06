import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] avgArr = new String[num];
        String[] strArr;
        for(int i=0; i<num; i++) {
            strArr = br.readLine().split(" ");
            Integer[] numArr = new Integer[strArr.length-1];
            int sum = 0;
            for(int j=0; j<strArr.length; j++) {
                if(j>0) {
                    sum += Integer.parseInt(strArr[j]);
                    numArr[j-1] = Integer.parseInt(strArr[j]);
                }
            }

            Arrays.sort(numArr, Collections.reverseOrder());

            float temp = 0.0f;
            for (int n : numArr) {
                if(n>sum/numArr.length) {
                    temp++;
                } else {
                    break;
                }
            }

            avgArr[i] = String.format("%.3f", temp/numArr.length*100);

        }

        for(int i=0;i<avgArr.length;i++) {
            System.out.println(avgArr[i] + "%");
        }
    }

}