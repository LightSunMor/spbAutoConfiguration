package com.morsun.spbautoconfiguration.Import.CommonClass;

import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.CommonClass
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */

public class ConfigA {
    //创建一个Bean,返回注入到Ioc中
    @Bean
    public A createA()
    {
        A a = new A();
        a.setMessage("普通类导入测试");
        return a;
    }
}
@Data
class A{
    private String message;
}