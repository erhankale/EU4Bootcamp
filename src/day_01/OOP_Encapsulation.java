package day_01;

public class OOP_Encapsulation {

    //name, id

    //if one of the instances is FINAL you don't need to crate setter method
    private String name;
    private int id;

    public OOP_Encapsulation() {
    }

    public OOP_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
