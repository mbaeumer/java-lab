package se.mbaeumer.javalab.streamdemo.flatmap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlatmapNonPrimitiveDemoTest {

    @Test
    void getProductsInOrders() {
        FlatmapNonPrimitiveDemo nonPrimitiveDemo = new FlatmapNonPrimitiveDemo();
        List<Product> orderedProducts = nonPrimitiveDemo.getProductsInOrders();
        assertEquals(36, orderedProducts.size());
    }
}