import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ft = 42;
        boolean[] arr = new boolean[ft];

        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num%ft] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){
                count++;
            }
        }

        System.out.println(count);
    }

}