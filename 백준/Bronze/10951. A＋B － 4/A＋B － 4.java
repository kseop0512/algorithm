import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            int num1 = str.charAt(0) - 48;
            int num2 = str.charAt(2) - 48;

            int sum = num1 + num2;
            System.out.println(sum);
        }
    }

}