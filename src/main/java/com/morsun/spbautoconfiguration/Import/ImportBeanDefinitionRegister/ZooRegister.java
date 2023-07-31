package com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */
public class ZooRegister  implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        GenericBeanDefinition gb = new GenericBeanDefinition();

        gb.setBeanClass(Dog.class);
        registry.registerBeanDefinition("dog1",gb);
    }
}
