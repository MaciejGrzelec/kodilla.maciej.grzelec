package com.kodilla.hibernate.invoice.dao;

/*import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product one");
        Product product2 = new Product("product two");

        Item item1 = new Item(new BigDecimal(100), 3);
        Item item2 = new Item(new BigDecimal(200), 2);

        Invoice inv1 = new Invoice("1");

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setProduct(product1);
        item2.setProduct(product2);


        inv1.getItems().add(item1);
        inv1.getItems().add(item2);

        item1.setInvoice(inv1);
        item2.setInvoice(inv1);

        //When
        invoiceDao.save(inv1);
        int id = inv1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}*/
