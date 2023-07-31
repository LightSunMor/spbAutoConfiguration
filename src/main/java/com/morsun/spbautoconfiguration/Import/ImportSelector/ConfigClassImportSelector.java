package com.morsun.spbautoconfiguration.Import.ImportSelector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @package_name: com.morsun.spbautoconfiguration.Import.ImportSelector
 * @date: 2023/7/29
 * @week: 星期六
 * @message:
 * @author: morSun
 */
@Configuration
@Import({ImportSelector.class})
public class ConfigClassImportSelector {
}
