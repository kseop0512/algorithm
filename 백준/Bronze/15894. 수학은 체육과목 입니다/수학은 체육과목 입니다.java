import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String q = br.readLine();

        long longQ = Long.parseLong(q);

        System.out.println(longQ*4);

    }
}