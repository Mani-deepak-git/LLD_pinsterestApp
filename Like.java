class Like {
    private User user;
    private Pin pin;

    public Like(User user, Pin pin) {
        this.user = user;
        this.pin = pin;
    }

    public User getUser() {
        return user;
    }

    public Pin getPin() {
        return pin;
    }
}