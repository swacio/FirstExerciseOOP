/**
 * Created by Verunex on 2017-03-30.
 */
public class Test {

    public static void main(String[] args) {

        //
        Product p1 = new Product("Długopis", 10, 0.1f , false);
        Product p2 = new Product("Zeszyt", 4, 0.4f, false );
        Product p3 = new Product("Whisky", 80, 1, true);

        //
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        //
        Client c1 = new Client("Maciej", 18, 26, 100,  b1);

        //
        Order o1 = new Order(1, c1);

        //
        b1.addProduct(p1, c1);
        b1.addProduct(p2,c1);
        b1.showWeightBasket();
        b1.showAllProducts();
        c1.showRemainingCapacity();
        o1.finishOrder(c1,b1);

        //
        Client c2 = new Client("Michał",17,5,100,b2);
        b2.addProduct(p3,c2);
        Order o2 = new Order(2, c2);
        o2.finishOrder(c2,b2);
        b2.showAllProducts();

        //
        Client c3 = new Client("Patryk", 18, 20, 1, b3);
        b3.addProduct(p3,c3);
        Order o3 = new Order(3, c3);
        o3.finishOrder(c3, b3);

        //
        Product p4 = new Book("sample book", 10 , 5, false,2000);

        b3.addProduct(p4, c3);
        b3.showAllProducts();



    }

}
