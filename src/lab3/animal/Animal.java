package lab3.animal;

public class Animal {
    private String name;
    private int noOfLegs;

    public String getName() {
        return name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public Animal() {
    }

    public void move()
}
