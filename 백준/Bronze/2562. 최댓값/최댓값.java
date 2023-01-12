import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val;
        int max = 0;
        int line = 0;
        for(int i=0; i<9; i++){

            val = Integer.parseInt(br.readLine());

            if(val > max) {
                max = val;
                line = i+1;
            }
        }

        System.out.println(max);
        System.out.println(line);
    }

}