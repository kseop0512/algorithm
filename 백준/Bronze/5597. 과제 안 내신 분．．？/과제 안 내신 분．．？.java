import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int students[] = new int[30];
        
        for(int i=0; i<students.length-2; i++) {
            
            int num = Integer.parseInt(br.readLine());
            students[num-1] = 1;
        }

        for(int j=0; j<students.length; j++) {
            if(students[j] != 1) {
                System.out.println(j+1);
            }
        }

    }

}