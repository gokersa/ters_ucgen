import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n-1; i>0; i--) {
            for (int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k=3; k<=(2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
