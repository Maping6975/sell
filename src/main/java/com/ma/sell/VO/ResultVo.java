package com.ma.sell.VO;

import lombok.Data;

/**
 * @program: sell
 * @description  http请求返回的试图
 * @author: mapping
 * @create: 2020-02-14
 **/
@Data
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;
}
