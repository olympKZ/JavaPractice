import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter how many times you want to print your message: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Hello World!");
        }
    }
}
