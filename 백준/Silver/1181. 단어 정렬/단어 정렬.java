import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String word = br.readLine();

            wordSet.add(word);

        }

        List<String> tempSet = new ArrayList<>(wordSet);

        Collections.sort(tempSet);

        tempSet.sort((String a, String b) -> a.length() - b.length());

        for (String word : tempSet) {
            System.out.println(word);
        }
        
    }
}