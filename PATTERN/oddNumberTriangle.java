package Pattern;
import java.util.Scanner;
public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*i-1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
