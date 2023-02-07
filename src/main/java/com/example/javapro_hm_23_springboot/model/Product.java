package com.example.javapro_hm_23_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link Product} is a product class.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private String name;
  private Integer id;
  private Double cost;


}
