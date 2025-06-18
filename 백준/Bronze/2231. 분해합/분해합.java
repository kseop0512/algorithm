import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine();
        String[] arr = strN.split("");
        int originN = Integer.parseInt(strN);
        int result = 0;
        int start = Math.max(1, originN - (arr.length * 9));

        for(int i = start; i <= originN; i++){

            int sum = 0;
            String currentN = Integer.toString(i);
            String[] currentArr = currentN.split("");
            for (String s : currentArr) {
                sum += Integer.parseInt(s);
            }

            if(i+sum == originN){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}