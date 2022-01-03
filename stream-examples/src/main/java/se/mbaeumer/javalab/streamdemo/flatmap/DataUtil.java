package se.mbaeumer.javalab.streamdemo.flatmap;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    private List<Product> products;
    private List<Order> orders = new ArrayList<>();

    public DataUtil() {
        products = createProducts();
    }

    public List<Order> createOrders(){
        Order order = new Order(1);
        order.getProducts().add(getProduct(1));
        order.getProducts().add(getProduct(5));
        order.getProducts().add(getProduct(8));
        order.getProducts().add(getProduct(9));
        orders.add(order);

        order = new Order(2);
        order.getProducts().add(getProduct(2));
        order.getProducts().add(getProduct(5));
        order.getProducts().add(getProduct(3));
        order.getProducts().add(getProduct(10));
        orders.add(order);

        order = new Order(3);
        order.getProducts().add(getProduct(1));
        order.getProducts().add(getProduct(2));
        order.getProducts().add(getProduct(4));
        order.getProducts().add(getProduct(5));
        orders.add(order);

        order = new Order(4);
        order.getProducts().add(getProduct(1));
        order.getProducts().add(getProduct(3));
        order.getProducts().add(getProduct(7));
        order.getProducts().add(getProduct(10));
        orders.add(order);

        order = new Order(5);
        order.getProducts().add(getProduct(1));
        order.getProducts().add(getProduct(8));
        order.getProducts().add(getProduct(9));
        order.getProducts().add(getProduct(10));
        orders.add(order);

        order = new Order(6);
        order.getProducts().add(getProduct(8));
        order.getProducts().add(getProduct(9));
        order.getProducts().add(getProduct(10));
        order.getProducts().add(getProduct(15));
        orders.add(order);

        order = new Order(7);
        order.getProducts().add(getProduct(7));
        order.getProducts().add(getProduct(2));
        order.getProducts().add(getProduct(1));
        order.getProducts().add(getProduct(5));
        orders.add(order);

        order = new Order(8);
        order.getProducts().add(getProduct(13));
        order.getProducts().add(getProduct(12));
        order.getProducts().add(getProduct(11));
        order.getProducts().add(getProduct(10));
        orders.add(order);

        order = new Order(9);
        order.getProducts().add(getProduct(5));
        order.getProducts().add(getProduct(6));
        order.getProducts().add(getProduct(7));
        order.getProducts().add(getProduct(8));
        orders.add(order);

        return orders;
    }

    public Product getProduct(final int id){
        return products.stream().filter( p -> p.getId() == id).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    public List<Product> createProducts(){
        products = new ArrayList<>();
        products.add(createProduct(1, "Die Hard DVD"));
        products.add(createProduct(2, "Pringles"));
        products.add(createProduct(3, "Öl"));
        products.add(createProduct(4, "Glass"));
        products.add(createProduct(5, "Diskmedel"));
        products.add(createProduct(6, "Oxfilé"));
        products.add(createProduct(7, "Gurka"));
        products.add(createProduct(8, "Tomater"));
        products.add(createProduct(9, "Vitlök"));
        products.add(createProduct(10, "Korv"));
        products.add(createProduct(11, "Lax"));
        products.add(createProduct(12, "Fetaost"));
        products.add(createProduct(13, "Salami"));
        products.add(createProduct(14, "Lök"));
        products.add(createProduct(15, "Cola"));

        return products;

    }

    public Product createProduct(final int id, final String name){
        return new Product(id, name);
    }
}
