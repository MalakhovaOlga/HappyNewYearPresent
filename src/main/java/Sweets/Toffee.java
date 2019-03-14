package Sweets;

public class Toffee extends Sweet {

    public Toffee () {

    }

    public Toffee(String name, float weight, float price, String code) {
        super(name, weight, price, code);
    }

    @Override
    public String toString() {
        return "Toffee" + super.toString();
    }
}
