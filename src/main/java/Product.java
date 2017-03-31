
public class Product {

    private String name;
    private float price;
    private float weight;
    private boolean forAdult;

    public Product(String name, float price, float weight, boolean forAdult) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.forAdult = forAdult;
    }

    public String infomationAboutProduct(Product product){

        String temp = "Nazwa: " + product.name + " Cena: " + product.price + " Waga: " + product.weight;

        return temp;

    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isForAdult() {
        return forAdult;
    }
}
