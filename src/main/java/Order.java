/**
 * Created by Verunex on 2017-03-30.
 */
public class Order{

    private int orderNumber;
    private Client client;



    public Order(int orderNumber, Client client) {
        this.orderNumber = orderNumber;
        this.client = client;

    }

    public void finishOrder(Client client, Basket basket){
        if(client.getCash() < basket.priceBasket()){
            System.out.println("Brak srodkow!");
        }else{
            System.out.println("Zrealizowano zamowienie, zabrano " + basket.priceBasket() + " zł");
        }
    }

}
