package com.kodilla.stream.invoice.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValue() {
        //Given
        Double sum = 0.0;
        SimpleProduct product1 = new SimpleProduct("Product 1", 10);
        SimpleItem item1 = new SimpleItem(product1, 10);
        SimpleProduct product2 = new SimpleProduct("Product 2", 20);
        SimpleItem item2 = new SimpleItem(product2, 20);
        List<SimpleItem> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        //When
        /*Double result = itemList.stream()
                .mapToDouble(f -> f.getValue())
                .sum();*/
        for(SimpleItem item : itemList) {
            sum = sum + item.getValue();
        }

        //Then
        assertEquals(0, sum, 0);

    }
}
