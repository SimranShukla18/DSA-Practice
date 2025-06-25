// How to make multiple input at one time.
package Arrays;
import java.util.Scanner;
public class inputOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0; i<=6; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<=6; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
