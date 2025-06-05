
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mn = br.readLine();

        int aN = Integer.parseInt(mn.split(" ")[0]);
        int aM = Integer.parseInt(mn.split(" ")[1]);

        int[][] aArr = new int[aN][aM];
        int[][] bArr = new int[aN][aM];


        // 첫번째 배열
        for (int i = 0; i < aN; i++) {
            String[] firstNumArr = br.readLine().split(" ");

            for (int j = 0; j < firstNumArr.length; j++) {
                aArr[i][j] = Integer.parseInt(firstNumArr[j]);
            }
        }

        // 두번째 배열
        for (int i = 0; i < aN; i++) {
            String[] secondNumArr = br.readLine().split(" ");
            for (int j = 0; j < secondNumArr.length; j++) {
                bArr[i][j] = Integer.parseInt(secondNumArr[j]);
            }
        }


        for(int i =0; i< aN; i++){
            for(int j =0; j< aM; j++){
                System.out.print(aArr[i][j] + bArr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}


