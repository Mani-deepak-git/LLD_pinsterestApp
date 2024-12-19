class Comment {
    private String commentId;
    private User user;
    private String content;

    public Comment(String commentId, User user, String content) {
        this.commentId = commentId;
        this.user = user;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }
}