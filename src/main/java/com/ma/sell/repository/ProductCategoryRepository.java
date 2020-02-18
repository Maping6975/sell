package com.ma.sell.repository;

import com.ma.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-14
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

}
