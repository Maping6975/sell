package com.ma.sell.service.impl;

import com.google.gson.Gson;
import com.ma.sell.dataobject.ProductCategory;
import com.ma.sell.repository.ProductCategoryRepository;
import com.ma.sell.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-14
 **/
@Service
public class CategroyServiceImpl implements CategroyService {
    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory findById(Integer Id) {
        Gson gson = new Gson();
        return repository.findById(Id).get();
    }
}
