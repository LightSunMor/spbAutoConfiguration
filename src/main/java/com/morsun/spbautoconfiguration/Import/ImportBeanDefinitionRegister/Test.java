package com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.ImportBeanDefinitionRegister
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClassDefinitionRegisterr.class);
//        Dog bean = context.getBean(Dog.class); //因为只创建了一个dog，所以可以不用指定
        Dog bean = context.getBean("dog1",Dog.class); //如果有多个，就需要指定Bean的Name来获取


        System.out.println(bean.getName());
        System.out.println(bean.getClass().getSimpleName());
    }
}
