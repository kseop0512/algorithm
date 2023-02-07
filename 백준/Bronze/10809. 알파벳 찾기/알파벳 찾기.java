import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] abcArr = new int[26];

        Arrays.fill(abcArr, -1);

        for(int i=0; i<word.length(); i++) {
            if(abcArr[word.charAt(i) - 97] == -1) {
                abcArr[word.charAt(i) - 97] = i;
            }
        }

        for(int n : abcArr) {
            System.out.print(n + " ");
        }

    }
}