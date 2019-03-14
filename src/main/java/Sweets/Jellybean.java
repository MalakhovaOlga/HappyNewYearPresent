package Sweets;

public class Jellybean extends Sweet {

    public Jellybean() {

    }

    public Jellybean(String name, float weight, float price, String code) {
        super(name, weight, price, code);
    }

    @Override
    public String toString() {
        return "Jellybean" + super.toString();
    }
}
