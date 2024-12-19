
import java.util.*;

public class PinterestApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User alice = new User("1", "alice", "password123");
        User bob = new User("2", "bob", "mypassword");
        users.add(alice);
        users.add(bob);
        Board aliceBoard = new Board("Alice's Board", alice);
        alice.createBoard("Alice's Board");
        Pin samplePin = new Pin("101", "Beautiful sunset", aliceBoard);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        User loggedInUser = User.authenticate(username, password, users);

        if (loggedInUser != null) {
            System.out.println("Welcome, " + loggedInUser.getUsername() + "!");
            loggedInUser.createBoard("Vacation Photos");
            System.out.println("Board 'Vacation Photos' created!");
            samplePin.addLike(loggedInUser);
            System.out.println(loggedInUser.getUsername() + " liked the pin: " + samplePin.getDescription());
            if (!loggedInUser.equals(bob)) {
                Follow follow = new Follow(loggedInUser, bob);
                loggedInUser.follow(bob);
                System.out.println(loggedInUser.getUsername() + " followed " + bob.getUsername() + "!");
            }
            System.out.println("Likes on the pin: ");
            for (User user : samplePin.getLikes()) {
                System.out.println(user.getUsername());
            }
        } else {
            System.out.println("Invalid credentials. Try again.");
        }

        scanner.close();
    }
}