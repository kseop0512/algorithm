import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> userList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String user = br.readLine();
            user = i + " " + user;

            userList.add(user);

        }

        Collections.sort(userList, (String a, String b) -> {

            if (a.split(" ")[1].equals(b.split(" ")[1])) {
                return Integer.compare(Integer.parseInt(a.split(" ")[0]), Integer.parseInt(b.split(" ")[0]));
            }

            return Integer.compare(Integer.parseInt(a.split(" ")[1]), Integer.parseInt(b.split(" ")[1]));
        });

        for (String user : userList) {
            String[] result = user.split(" ");
            System.out.println(result[1] + " " + result[2]);
        }

    }
}