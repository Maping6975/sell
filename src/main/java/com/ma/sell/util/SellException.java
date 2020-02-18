package com.ma.sell.util;

import com.ma.sell.enums.ProductStatusEnum;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-16
 **/
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ProductStatusEnum productEnmu) {
        super(productEnmu.getMsg());
        this.code = productEnmu.getCode();
    }
}
