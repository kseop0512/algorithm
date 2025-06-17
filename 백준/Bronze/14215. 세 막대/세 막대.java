import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String q = br.readLine();

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(q.split(" ")[i]);
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        int result = 0;
        if (a == b && b == c) {
            result = a + b + c;
        } else {
            while(a + b <= c){
                c--;
            }
            result = a + b + c;
        }

        System.out.println(result);


    }
}