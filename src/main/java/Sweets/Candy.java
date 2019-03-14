package Sweets;

public class Candy extends Sweet {

    public Candy () {

    }

    public Candy(String name, float weight, float price, String code) {
        super(name, weight, price, code);
    }

    @Override
    public String toString() {
        return "Candy" + super.toString();
    }
}
