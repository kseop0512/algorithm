import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int c = Integer.parseInt(n);

        int[] xArr = new int[c];
        int[] yArr = new int[c];

        int width = 0;
        int height = 0;

        for (int i = 0; i < c; i++) {

            String xy = br.readLine();
            int x = Integer.parseInt(xy.split(" ")[0]);
            int y = Integer.parseInt(xy.split(" ")[1]);

            xArr[i] = x;
            yArr[i] = y;
        }

        if (c < 2) {
            System.out.println(0);
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);

        width = xArr[c-1] - xArr[0];
        height = yArr[c-1] - yArr[0];

        if (c > 1) {
            System.out.println(width * height);
        }

    }
}