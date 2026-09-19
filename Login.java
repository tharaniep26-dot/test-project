import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                scanner.close();
                return;
            } else {
                attempts--;

                if (attempts > 0) {
                    System.out.println("Invalid username or password. Attempts left: " + attempts);
                } else {
                    System.out.println("Too many failed attempts. Account locked.");
                }
            }
        }

        scanner.close();
    }
}
