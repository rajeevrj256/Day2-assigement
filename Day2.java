import java.util.Scanner;

public class ConditionalActions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        if (M % 3 == 0 && M % 5 == 0) {
            System.out.println("Good Number");
        } else if (M % 3 == 0 && M % 5 != 0) {
            System.out.println("Bad Number");
        } else if (M % 3 != 0 && M % 5 == 0) {
            System.out.println("Poor Number");
        } else {
            System.out.println("-1");
        }
        
        scanner.close();
    }
}
