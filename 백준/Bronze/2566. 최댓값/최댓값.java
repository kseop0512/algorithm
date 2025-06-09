
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] numArr = new int[9][9];
        int[] maxArr = new int[9];
        int[][] lineMaxArr = new int[9][3];


        for(int i=0; i<9; i++){
            String[] lineArr = br.readLine().split(" ");
            int max = 0;
            for(int j=0; j<lineArr.length; j++){
                numArr[i][j] = Integer.parseInt(lineArr[j]);

                max = Math.max(max, numArr[i][j]);

            }
            maxArr[i] = max;
        }

        int resultMax = 0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(maxArr[i] == numArr[i][j]) {
                    lineMaxArr[i][0] = maxArr[i];
                    lineMaxArr[i][1] = i+1;
                    lineMaxArr[i][2] = j+1;
                    break;
                }
            }
            resultMax = Math.max(resultMax, maxArr[i]);
        }

        System.out.println( resultMax);
        for(int i=0; i<9; i++) {
            if (lineMaxArr[i][0] == resultMax) {
                System.out.println(lineMaxArr[i][1] + " " + lineMaxArr[i][2]);
            }

        }
    }
}
