import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String qStr = br.readLine();
        String[] qArr = qStr.split(" ");

        int distance = 0;
        int x = Integer.parseInt(qArr[0]), y = Integer.parseInt(qArr[1]);
        int w = Integer.parseInt(qArr[2]), h = Integer.parseInt(qArr[3]);

        int xw = w - x;
        int yh = h - y;

        int xwyh = Math.min(xw, yh);
        int xy = Math.min(x, y);

        distance = Math.min(xwyh, xy);

        System.out.println(distance);
    }
}