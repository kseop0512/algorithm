import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        double[] scoreNumArr = new double[num];
        String score = br.readLine();
        String[] scoreArr = score.split(" ");

        for(int i=0; i<scoreArr.length; i++) {
            int scoreTemp = Integer.parseInt(scoreArr[i]);
            scoreNumArr[i] = scoreTemp;
        }

        Arrays.sort(scoreNumArr);
        double m = scoreNumArr[scoreArr.length-1];
        double sum = 0;
        for(int j=0; j<num; j++) {
            scoreNumArr[j] = scoreNumArr[j]/m*100;
            sum += scoreNumArr[j];
        }

        System.out.println(sum/num);
    }

}