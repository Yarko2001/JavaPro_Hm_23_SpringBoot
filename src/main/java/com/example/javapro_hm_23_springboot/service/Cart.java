package com.example.javapro_hm_23_springboot.service;

import com.example.javapro_hm_23_springboot.model.Product;
import com.example.javapro_hm_23_springboot.repository.ProductRepository;
import java.util.HashMap;
import java.util.Map;
import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * {@link Cart} is a store class, where you can add and remove the products.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@Value
@Service
@Scope("prototype")
public class Cart {

  ProductRepository productRepository;
  Map<Integer, Product> productList = new HashMap<>();

  /**
   * adding the product
   *
   * @param id product id
   */
  public void addProduct(Integer id) {
    productList.put(id, productRepository.getProduct(id));
  }

  /**
   * removing the product
   *
   * @param id product id
   */
  public void removeProduct(Integer id) {
    productList.remove(id, productRepository.getProduct(id));
  }

}
