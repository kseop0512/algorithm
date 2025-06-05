import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordNum = Integer.parseInt(br.readLine());

        String[] wordArr = new String[wordNum];
        for(int i = 0; i < wordNum; i++) {
            wordArr[i] = br.readLine();
        }

        int result = 0;
        boolean isDup = true;
        for(String word : wordArr){

            for(int i = 0; i < word.length() - 1; i++){
                char currentWord = word.charAt(i);
                char nextWord = word.charAt(i+1);

                if (currentWord == nextWord) {
                    continue;
                }

                if (word.lastIndexOf(currentWord) > i) {
                    isDup = false;
                    break;
                }


            }

            if(isDup){
                result++;
            }
            isDup = true;
        }


        System.out.println(result);

    }
}


