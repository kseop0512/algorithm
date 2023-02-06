import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] resultArr = new int[num];
        int temp = 0;

        while(true){
            temp++;

            String ox = br.readLine();
            int sum = 0;
            int tempNum = 0;
            for(int i=0; i<ox.length(); i++) {
                if('O' == ox.charAt(i)){
                    tempNum += 1;
                    sum += tempNum;
                } else {
                    tempNum = 0;
                }
            }
            resultArr[temp-1] = sum;
            if(temp == num) break;
        }

        for(int j=0; j<num; j++) {
            System.out.println(resultArr[j]);
        }
    }

}