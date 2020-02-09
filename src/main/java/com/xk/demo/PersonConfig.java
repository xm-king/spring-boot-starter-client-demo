package com.xk.demo;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author pingchun@meili-inc.com
 * @since 2020/1/6
 */
@Configuration
@EnableConfigurationProperties(PersonProperty.class)
public class PersonConfig {
}
