import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
 
        String[] str = br.readLine().split(" ");
 
        int v = Integer.parseInt(br.readLine());
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int count = 0;
        for (int i : arr) {
            if (i == v) {
                count++;
            }
        }

        System.out.println(count);

    }

}