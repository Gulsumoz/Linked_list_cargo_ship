public class Item {

    private  String Name;
    private  double Weight;
    private  double Value;
    private  String Durability;
    private int Id;


    public Item(){

    }

    public Item(String name, double weight, double value, String durability, int id){
        this.Name=name;
        this.Weight=weight;
        this.Value=value;
        this.Durability=durability;
        this.Id=id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public String getDurability() {
        return Durability;
    }

    public void setDurability(String durability) {
        Durability = durability;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }




}


