package se.mbaeumer.javalab.streamdemo.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapNonPrimitiveDemo {

    public List<Product> getProductsInOrders(){
        DataUtil dataUtil = new DataUtil();
        List<Order> orders = dataUtil.createOrders();

        return orders.stream()
                .map(order -> order.getProducts())
                .flatMap(products -> products.stream()).collect(Collectors.toList());
                //.flatMap(order -> Stream.of(order.getProducts())).collect(Collectors.toList())
                //.stream().flatMap(products -> Stream.of(products)).collect(Collectors.toList());
    }
}
