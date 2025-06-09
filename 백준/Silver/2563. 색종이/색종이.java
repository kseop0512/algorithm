import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        final int SIZE = 10;

        int row = 0;
        int col = 0;

        int[][] xyArr = new int[cnt][2];

        for(int i = 0; i < cnt; i++) {
            String xyStr = br.readLine();
            xyArr[i][0] = Integer.parseInt(xyStr.split(" ")[0]);
            xyArr[i][1] = Integer.parseInt(xyStr.split(" ")[1]);

            row = Math.max(row, xyArr[i][1]);
            col = Math.max(col, xyArr[i][0]);

        }

        boolean[][] square = new boolean[row + SIZE][col + SIZE];

        for(int i = 0; i < cnt; i++) {
            for (int j = (xyArr[i][1]); j < (xyArr[i][1]) + SIZE; j++) {
                for(int k = (xyArr[i][0]); k < (xyArr[i][0]) + SIZE; k++) {
                    square[j][k] = true;
                }
            }
            

        }


       int total = 0;


        for(int i = 0; i < row + SIZE; i++) {
            for(int j = 0; j < col + SIZE; j++) {
                if(square[i][j]) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}