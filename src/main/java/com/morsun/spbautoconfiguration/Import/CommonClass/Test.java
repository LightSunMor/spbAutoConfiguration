package com.morsun.spbautoconfiguration.Import.CommonClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.CommonClass
 * @date: 2023/7/29
 * @week: 星期六
 * @message: 测试容器注入是否成功
 * @author: morSun
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClassB.class);
        ConfigA beanA = context.getBean(ConfigA.class);
        A a = context.getBean(A.class);
        //done 已成功注入到容器中（可以导入一些复杂的普通通用类，给开发人员使用）
        System.out.println(a.getMessage());
        System.out.println(beanA.createA().getMessage());
        System.out.println(beanA.getClass().getSimpleName());
    }
}
