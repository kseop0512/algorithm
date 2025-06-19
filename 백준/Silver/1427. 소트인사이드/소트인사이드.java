import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String q = br.readLine();
        int ql = q.length();
        String[] qArr = q.split("");

        int[] arr = new int[ql];

        for(int i = 0; i < ql; i++){
            arr[i] = Integer.parseInt(qArr[i]);
        }

        Arrays.sort(arr);

        for(int i = ql-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}