import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Integer[] arr = new Integer[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) > 'Z') {
                arr[str.charAt(i)-'a'] += 1;
            } else {
                arr[str.charAt(i)-'A'] += 1;
            }
        }
        Integer[] sortArr = arr.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        int second = arr[1];
        int idx = 0;
        if(first != second) {
            for (int j=0; j<sortArr.length; j++) {
                if(first == sortArr[j]) {
                    idx = j;
                    break;
                }
            }
            System.out.println((char)(idx+65));
        } else {
            System.out.println("?");
        }

    }
}
