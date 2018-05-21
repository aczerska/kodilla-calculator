package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Bananas");
        Product product2 = new Product("Apples");

        Item item11 = new Item(new BigDecimal(4.5), 10, new BigDecimal(45));
        Item item12 = new Item(new BigDecimal(4.5), 5, new BigDecimal(22.5));
        Item item13 = new Item(new BigDecimal(4.5), 30, new BigDecimal(135));
        Item item21 = new Item(new BigDecimal(6), 5, new BigDecimal(30));
        Item item22 = new Item(new BigDecimal(6), 1, new BigDecimal(6));
        Item item23 = new Item(new BigDecimal(6), 10, new BigDecimal(60));

        item11.setProduct(product1);
        item12.setProduct(product1);
        item13.setProduct(product1);
        item21.setProduct(product2);
        item22.setProduct(product2);
        item23.setProduct(product2);

        product1.getItems().add(item11);
        product1.getItems().add(item12);
        product1.getItems().add(item13);
        product2.getItems().add(item21);
        product2.getItems().add(item22);
        product2.getItems().add(item23);

        Invoice invoice1 = new Invoice("Fruits1");
        Invoice invoice2 = new Invoice("Fruits2");
        Invoice invoice3 = new Invoice("Fruits3");

        item11.setInvoice(invoice1);
        item21.setInvoice(invoice1);
        item12.setInvoice(invoice2);
        item22.setInvoice(invoice2);
        item13.setInvoice(invoice3);
        item23.setInvoice(invoice3);

        invoice1.getItems().add(item11);
        invoice1.getItems().add(item21);
        invoice2.getItems().add(item12);
        invoice2.getItems().add(item22);
        invoice3.getItems().add(item13);
        invoice3.getItems().add(item23);


        //When

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);
        Assert.assertNotEquals(0, invoice2Id);
        Assert.assertNotEquals(0, invoice3Id);

        //Cleanup
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
            invoiceDao.deleteById(invoice3Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
