package com.morsun.spbautoconfiguration.Import.ImportSelector;

import org.springframework.core.type.AnnotationMetadata;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.ImportSelector
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */
public class ImportSelector implements org.springframework.context.annotation.ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 返回时需要填写全类名，而且可以写多个，也就是说可以导入多个B配置类
        return new String[]{"com.morsun.spbautoconfiguration.Import.ImportSelector.ConfigA"};
    }
}
