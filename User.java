import java.util.*;

class User {
    private String userId;
    private String username;
    private String password;
    private List<Board> boards;
    private Set<User> followers;
    private Set<User> following;

    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.boards = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }

    public static User authenticate(String username, String password, List<User> users) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void createBoard(String boardName) {
        Board newBoard = new Board(boardName, this);
        boards.add(newBoard);
    }

    public void follow(User user) {
        if (!user.equals(this)) {
            following.add(user);
            user.followers.add(this);
    
    public Set<User> getFollowers() {
        return followers;
    }

    public Set<User> getFollowing() {
        return following;
    }
}