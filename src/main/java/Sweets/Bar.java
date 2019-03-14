package Sweets;

public class Bar extends Sweet {

    public Bar () {

    }

    public Bar(String name, float weight, float price, String code) {
        super(name, weight, price, code);
    }

    @Override
    public String toString() {
        return "Bar" + super.toString();
    }
}
