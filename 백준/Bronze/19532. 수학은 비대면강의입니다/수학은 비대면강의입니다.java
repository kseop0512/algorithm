import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String abcdef = br.readLine();

        int a = Integer.parseInt(abcdef.split(" ")[0]);
        int b = Integer.parseInt(abcdef.split(" ")[1]);
        int c = Integer.parseInt(abcdef.split(" ")[2]);
        int d = Integer.parseInt(abcdef.split(" ")[3]);
        int e = Integer.parseInt(abcdef.split(" ")[4]);
        int f = Integer.parseInt(abcdef.split(" ")[5]);

        // 힌트 코드 구조
        outerLoop:
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                
                if (a*x + b*y == c && d*x + e*y == f) {
                    // 답 찾음!

                    System.out.println(x + " " + y);
                    break outerLoop;
                }
            }
        }


    }

}