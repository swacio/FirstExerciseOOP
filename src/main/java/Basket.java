import java.util.ArrayList;

/**
 * Created by Verunex on 2017-03-30.
 */

public class Basket {

    private ArrayList<Product> productArrayList;
    private Client client;


    public Basket() {
        this.productArrayList = new ArrayList<Product>();
    }

    public void addProduct(Product product, Client client){
        float temp = client.remainingCapacity();
        if(temp < product.getWeight()){
            System.out.println("Przykro mi nie mozesz dodac wiecej do koszyka!");
        }else{
            if(product.isForAdult() && client.getAge()<18){
                System.out.println("Ograniczenia wiekowe!");
            }else {
                productArrayList.add(product);
            }
        }
    }

    public void removeProduct(Product product){
        productArrayList.remove(product);
    }

    public void removeAllProducts(){
        productArrayList.clear();
    }

    public void showAllProducts(){
        int temp = 0;
        for (Product product : productArrayList){
            temp++;
            System.out.println("Produkt nr " + temp + " : " + product.infomationAboutProduct(product));
        }
    }

    public float weightBasket(){
        float temp = 0;
        for(Product product : productArrayList){
            temp = temp + product.getWeight();
        }

        return temp;
    }

    public void showWeightBasket(){
        System.out.println(weightBasket());
    }

    public float priceBasket(){
        float temp = 0;
        for(Product product : productArrayList){
            temp = temp + product.getPrice();
        }

        return temp;
    }


}
