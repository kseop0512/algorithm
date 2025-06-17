import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {

            String q = br.readLine();
            if(q.equals("0 0 0")) {break;}

            int[] qArr = new int[3];
            String[] s = q.split(" ");
            for(int i = 0; i < 3; i++) {
                qArr[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(qArr);

            int a = qArr[0];
            int b = qArr[1];
            int c = qArr[2];

            if (a + b <= c) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        }

    }
}