package com.ma.sell.repository;

import com.ma.sell.dataobject.ProductCategory;
import com.ma.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-14
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findListTest(){
        //List<ProductCategory> productCategoryList = repository.findAll();
        //System.out.println(productCategoryList.toString());
        PageRequest request = new PageRequest(0,2);
        Page<ProductCategory> productCategoryPage = repository.findAll(request);
        System.out.println(productCategoryPage.getTotalElements());
    }

    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findById(ProductStatusEnum.down.getCode()).get();
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("2222");
        productCategory.setCategoryType(3);
        productCategory.setCreateTime(new Date());
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }
}