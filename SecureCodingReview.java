import java.util.Scanner;

public class SecureCodingReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals("Raj") && password.equals("password123")) {
            System.out.println("Welcome, admin!");
        } else {
            System.out.println("Invalid username or password");
        }

        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        String sqlQuery = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        System.out.println("SQL Query: " + sqlQuery);
    }
}