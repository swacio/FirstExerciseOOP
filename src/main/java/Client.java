/**
 * Created by Verunex on 2017-03-30.
 */
public class Client {

    private String name;
    private int age;
    private float capacity;
    private float cash;

    private Basket basket;

    public Client(String name, int age, float capacity , float cash, Basket basket) {
        this.name = name;
        this.age = age;
        this.capacity = capacity;
        this.cash = cash;
        this.basket = basket;
    }

    public float remainingCapacity(){
        float temp = capacity - basket.weightBasket();
        return temp;
    }

    public void showRemainingCapacity(){
        System.out.println(remainingCapacity());
    }

    public int getAge() {
        return age;
    }

    public float getCash() {
        return cash;
    }
}
