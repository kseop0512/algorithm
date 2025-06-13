import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        for(int i=0; i<5; i++) {

            String line = br.readLine();
            char[] charArr = line.toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                arr[i][j] = charArr[j];
            }
        }


        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] != 0) {
                    System.out.print(arr[j][i]);
                }
            }
        }
        System.out.println("\n");

    }
}