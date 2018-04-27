
public class Consumable extends Item {
    private String color;
    private String taste;
    private String smell;

    public Consumable(String Color, String Taste, String Smell, String name, double weight, double value, String durability, int id) {
        super(name, weight, value, durability, id);
        this.color = Color;
        this.taste = Taste;
        this.smell = Smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
