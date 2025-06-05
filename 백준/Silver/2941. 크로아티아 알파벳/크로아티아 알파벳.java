import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String qStr = br.readLine();

        String[] langArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Integer result = 0;

        for (String s : langArr) {

            if (qStr.contains(s)) {
                qStr = qStr.replace(s, "K");
            }
        }

        result += qStr.length();

        System.out.println(result);
    }
}