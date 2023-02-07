package com.example.javapro_hm_23_springboot.repository;

import com.example.javapro_hm_23_springboot.model.Product;
import com.example.javapro_hm_23_springboot.model.ProductList;
import lombok.Value;
import org.springframework.stereotype.Repository;

/**
 * {@link ProductRepository} is a store class with a method to get products from
 * {@link ProductList}
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@Value
@Repository
public class ProductRepository {

  ProductList products;

  /**
   * get the product by id
   *
   * @param id product id
   * @return {@link Product} product
   */

  public Product getProduct(Integer id) {
    return products.getProduct(id);
  }


}
