package com.morsun.spbautoconfiguration.Import.CommonClass;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.CommonClass
 * @date: 2023/7/29
 * @week: 星期六
 * @message: 创建配置类B，使用ConfigA这个普通类
 * @author: morSun
 */
@Configuration
@Import(ConfigA.class)
public class ConfigClassB {
}
