class Follow {
    private User follower;
    private User following;

    public Follow(User follower, User following) {
        this.follower = follower;
        this.following = following;
    }

    public User getFollower() {
        return follower;
    }

    public User getFollowing() {
        return following;
    }
}
