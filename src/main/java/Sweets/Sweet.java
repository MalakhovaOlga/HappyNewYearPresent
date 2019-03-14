package Sweets;

public abstract class Sweet {
    private String name;
    private float weight;  // вес
    private float price;
    private String code;  // артикул


    public Sweet () {
    }

    public Sweet(String name, float weight, float price, String code) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return  " {name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", code='" + code + '\'' +
                '}';
    }
}
