import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int getNum = num / 4;

        for(int i = 1; i <= getNum; i++) {System.out.print("long ");}

        System.out.println("int");
    }
}
