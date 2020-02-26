package com.ma.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-25
 **/
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatMpConfig {
    private String mpAppId;
}
