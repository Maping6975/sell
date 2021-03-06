package com.ma.sell.controller;

import com.ma.sell.VO.ResultVo;
import com.ma.sell.config.WeChatMpConfig;
import com.ma.sell.enums.ProductStatusEnum;
import com.ma.sell.util.SellException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sell
 * @description 买家商品
 * @author: mapping
 * @create: 2020-02-14
 **/
@RestController
@RequestMapping("/buyer/product")
@Slf4j
public class BuyerProductController {
    @Autowired
    private WeChatMpConfig weChatMpConfig ;
    @GetMapping("/list")
    public ResultVo list(){
        ResultVo resultVo = new ResultVo();
        resultVo.setMsg(weChatMpConfig.getMpAppId());
        log.info("******************************11121111");
        if(true){
            throw new SellException(ProductStatusEnum.down);
        }
        return resultVo;
    }
}
