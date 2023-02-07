import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strNum = br.readLine();
        int result = hansoo(strNum);
        System.out.println(result);
    }
    public static int hansoo(String num) {
        int n = Integer.parseInt(num);
        int result = 0;

        if(n <= 110) {
            if(n < 100){
                return n;
            }
            result = 99;
        } else {
            result = 99;
            for (int i=111;i<=n;i++){
                int n1 = i%10;
                int n2 = (i/10)%10;
                int n3 = i/100;

                if((n3-n2) == (n2-n1)) {
                    result++;
                }

            }
        }

        return result;
    }
}