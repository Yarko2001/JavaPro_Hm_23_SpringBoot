package com.example.javapro_hm_23_springboot.model;

import java.util.Map;
import lombok.Value;

/**
 * @author Yaroslav Dehtiar on 04.02.2023 {@link ProductList} is a class for storing products, and
 * getting them.
 */
@Value
public class ProductList {

  Map<Integer, Product> products;

  /**
   * Get the product by id.
   *
   * @param id product id
   * @return {@link Product} product
   */

  public Product getProduct(Integer id) {
    return products.get(id);
  }


}
