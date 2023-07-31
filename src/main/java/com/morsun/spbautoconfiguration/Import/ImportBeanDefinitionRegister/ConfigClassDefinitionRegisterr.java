package com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */
@Configuration
@Import({ZooRegister.class})
public class ConfigClassDefinitionRegisterr {
}
