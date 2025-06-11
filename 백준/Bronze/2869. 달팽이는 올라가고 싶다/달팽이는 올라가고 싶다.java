
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String snail = br.readLine();
        String[] snailArr = snail.split(" ");

        int up = Integer.parseInt(snailArr[0]);
        int down = Integer.parseInt(snailArr[1]);
        int meter = Integer.parseInt(snailArr[2]);

        int days =  (meter - down) / (up - down);

        if ((meter - down) % (up - down) != 0) {
            days++;
        }
        System.out.println(days);

    }

}