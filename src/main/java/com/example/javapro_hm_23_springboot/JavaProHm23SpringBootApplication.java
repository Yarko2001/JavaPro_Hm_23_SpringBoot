package com.example.javapro_hm_23_springboot;

import com.example.javapro_hm_23_springboot.service.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaProHm23SpringBootApplication {

  @Autowired
  private Cart cart1;
  @Autowired
  private Cart cart2;

  public static void main(String[] args) {
    SpringApplication.run(JavaProHm23SpringBootApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void inited() {

    System.out.println("All products in ProductRepository: \n" + cart1.getProductRepository());

    cart1.addProduct(1);
    cart1.addProduct(5);
    cart1.addProduct(3);
    System.out.println("Products in the cart1 after adding : " + cart1.getProductList());

    cart1.removeProduct(1);
    System.out.println("Products in the cart1 after removing : " + cart1.getProductList());

    cart2.addProduct(1);
    cart2.addProduct(2);
    cart2.addProduct(3);
    System.out.println("Products in the cart1 after adding : " + cart2.getProductList());

    cart2.removeProduct(1);
    System.out.println("Products in the cart1 after removing : " + cart2.getProductList());
  }

}
