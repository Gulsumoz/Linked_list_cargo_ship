public class Weapon extends Item {
    private String kind;
    private String model;
    private double area_of_effect;
    public Weapon( String Kind, String Model, double Area_of_effect, String name, double weight, double value, String durability, int id) {
        super(name, weight, value, durability, id);
        this.kind=Kind;
        this.model=Model;
        this.area_of_effect=Area_of_effect;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getArea_of_effect() {
        return area_of_effect;
    }

    public void setArea_of_effect(double area_of_effect) {
        this.area_of_effect = area_of_effect;
    }
}