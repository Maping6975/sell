package com.ma.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description 商品状态
 * @author: mapping
 * @create: 2020-02-14
 **/
@Getter
public enum ProductStatusEnum {
    up(0,"上架"),
    down(1,"下架");
    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
