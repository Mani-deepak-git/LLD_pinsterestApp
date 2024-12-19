import java.util.*;

class Pin {
    private String pinId;
    private String description;
    private Board board;
    private Set<Comment> comments;
    private Set<User> likes;

    public Pin(String pinId, String description, Board board) {
        this.pinId = pinId;
        this.description = description;
        this.board = board;
        this.comments = new HashSet<>();
        this.likes = new HashSet<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addLike(User user) {
        likes.add(user);
    }

    public String getPinId() {
        return pinId;
    }

    public String getDescription() {
        return description;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public Set<User> getLikes() {
        return likes;
    }
}
