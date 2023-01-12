import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        String[] arrStr = br.readLine().split(" ");

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        List<Integer> myList = new ArrayList<Integer>();
        
        for(int j=0; j<n; j++) {
            if(arr[j] < x){
                myList.add(arr[j]);
            }
        }
    
        for(int k=0; k<myList.size(); k++){
            System.out.print(myList.get(k));
            if(k < myList.size()-1){
                System.out.print(" ");
            } else {
                System.out.print("\n");
            }
        }

    }

}