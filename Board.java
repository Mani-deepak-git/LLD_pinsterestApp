import java.util.*;

class Board {
    private String name;
    private User owner;
    private List<Pin> pins;

    public Board(String name, User owner) {
        this.name = name;
        this.owner = owner;
        this.pins = new ArrayList<>();
    }

    public void addPin(Pin pin) {
        pins.add(pin);
    }

    public String getName() {
        return name;
    }
}