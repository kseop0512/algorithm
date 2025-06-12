import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cnt = br.readLine();
        String numbers = br.readLine();
        int number = Integer.parseInt(cnt);
        String[] numberArr = numbers.split(" ");

        int result = 0;

        for (int i = 0; i < number; i++) {

            int divideNum = 1;
            int q = Integer.parseInt(numberArr[i]);

            while(true) {

                divideNum++;
                if (q < 2) {
                    break;
                }

                if (divideNum > q / 2 ) {
                    divideNum = 777;
                    break;
                }

                if (q % divideNum == 0) {
                    if(divideNum > 1 && divideNum < q){
                        break;
                    }
                }
            }

            if (divideNum == 777) {
                result++;
            }


        }

        System.out.println(result);

    }

}