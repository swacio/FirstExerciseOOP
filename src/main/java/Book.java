/**
 * Created by Verunex on 2017-03-30.
 */
public class Book extends Product {

    private int numberOfPages;

    public Book(String name, float price, float weight, boolean forAdult, int numberOfPages) {
        super(name, price, weight, forAdult);
        this.numberOfPages = numberOfPages;
    }


}
