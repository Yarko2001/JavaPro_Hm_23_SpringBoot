package com.example.javapro_hm_23_springboot.configuration;

import com.example.javapro_hm_23_springboot.model.Product;
import com.example.javapro_hm_23_springboot.model.ProductList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link ProductConfiguration} is a class for creation beans of products {@link ProductList}.
 *
 * @author Yaroslav Dehtiar on 04.02.2023
 */
@Configuration
public class ProductConfiguration {

  /**
   * Create a new product list and to add {@link Product} into it.
   *
   * @return new {@link ProductList}
   */
  @Bean
  public ProductList products() {
    Map<Integer, Product> products = new HashMap<>();
    products.put(1, new Product("bread", 1, 18.50));
    products.put(2, new Product("buckwheat", 2, 80.99));
    products.put(3, new Product("chicken", 3, 100.0));
    products.put(4, new Product("banana", 4, 40.0));
    products.put(5, new Product("cucumber", 6, 40.0));
    products.put(6, new Product("tomato", 6, 50.0));
    return new ProductList(products);
  }

}
