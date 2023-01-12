import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb;

        String num1, num2;

        int count = 0;
        sb = new StringBuilder(str);
        while(true){
            count++;

            if(sb.length() == 1) {
                sb.insert(0, "0");
            }

            num1 = sb.substring(1, 2);
            num2 = String.valueOf(Integer.parseInt(sb.substring(0, 1)) + Integer.parseInt(sb.substring(1, 2)));
            sb.setLength(0);

            sb.append(num1).append(num2.substring(num2.length() - 1, num2.length()));

            if(Integer.parseInt(str) == Integer.parseInt(String.valueOf(sb))) {
                break;
            }
        }

        System.out.println(count);
    }

}