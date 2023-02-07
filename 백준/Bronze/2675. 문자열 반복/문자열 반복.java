import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] resultArr = new String[num];

        for(int i=0; i<num; i++) {
            String[] strArr = br.readLine().split(" ");
            int re = Integer.parseInt(strArr[0]);
            String str = strArr[1];
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            for(int j=1; j<=re*str.length(); j++) {

                sb.append(str.charAt(temp));
                if(j%re == 0) {
                    temp++;
                }
            }

            resultArr[i] = String.valueOf(sb);
            sb.setLength(0);
        }


        for(String s : resultArr) {
            System.out.println(s);
        }
    }
}