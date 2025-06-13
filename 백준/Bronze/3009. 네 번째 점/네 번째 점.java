import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for (int i = 0; i < 3; i++) {

            String q = br.readLine();
            int x = Integer.parseInt(q.split(" ")[0]);
            int y = Integer.parseInt(q.split(" ")[1]);

            xArr[i] = x;
            yArr[i] = y;
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);

        int resultX = 0;
        int resultY = 0;

        if(xArr[0] == xArr[1]){
            resultX = xArr[2];
        } else {
            resultX = xArr[0];
        }

        if(yArr[0] == yArr[1]){
            resultY = yArr[2];
        } else {
            resultY = yArr[0];
        }

        System.out.println(resultX + " " + resultY);

    }
}