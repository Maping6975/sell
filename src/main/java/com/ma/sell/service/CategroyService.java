package com.ma.sell.service;

import com.ma.sell.dataobject.ProductCategory;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-14
 **/
public interface CategroyService {
    ProductCategory findById(Integer Id);
}
