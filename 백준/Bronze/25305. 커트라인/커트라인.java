import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine();
        String[] strNArr = strN.split(" ");

        int n = Integer.parseInt(strNArr[0]);
        int k = Integer.parseInt(strNArr[1]);

        int[] score = new int[n];
        String scoreStr = br.readLine();
        String[] scoreArr = scoreStr.split(" ");

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(scoreArr[i]);
        }

        Arrays.sort(score);

        System.out.println(score[n-k]);


    }
}