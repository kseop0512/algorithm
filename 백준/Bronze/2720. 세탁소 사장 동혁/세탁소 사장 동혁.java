
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    static class Money {
        private int amount;

        public Money(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void subtract(int value) {
            this.amount -= value;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        int[][] resultArr = new int[cnt][4];

        for (int i = 0; i < cnt; i++) {
            Money money = new Money(Integer.parseInt(br.readLine()));

            resultArr[i][0] = getChange(money, quarter);
            resultArr[i][1] = getChange(money, dime);
            resultArr[i][2] = getChange(money, nickel);
            resultArr[i][3] = getChange(money, penny);
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(resultArr[i][0] + " " + resultArr[i][1] + " " + resultArr[i][2] + " " + resultArr[i][3]  + "\n");
        }

    }

    public static int getChange(Money money, int change) {

        int changeCnt = 0;

        while (money.getAmount() >= change) {
            changeCnt++;
            money.subtract(change);
        }

        return changeCnt;
    }

}


