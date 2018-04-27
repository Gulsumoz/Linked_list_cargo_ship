public class Equipable extends Item{
    private String use;
    private double volume;
    private String color;

    public Equipable(String Use, double Volume, String Color, String name, double weight, double value, String durability, int id ){
        super(name, weight, value, durability, id);
        this.use=Use;
        this.volume=Volume;
        this.color=Color;

    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

