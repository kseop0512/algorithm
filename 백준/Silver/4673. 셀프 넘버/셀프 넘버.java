import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int limit = 10001;
        boolean[] selfNumArr = new boolean[limit];
        for (int i=1; i<limit; i++) {

            int result = d(i);

            if(result < limit) {
                selfNumArr[result] = true;
            }
        }
        for(int j=1; j<limit; j++) {
            if(!selfNumArr[j]) {
                System.out.println(j);
            }

        }
    }
    public static int d(int num) {
        int sum = num;
        while(num != 0) {
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}