package com.liucan.vigoss.spring.boot.starter;

import com.liucan.vigoss.core.VigossConnnector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liucan
 * @date 12/6/20 3:42 PM
 */
@Configuration
@ConditionalOnClass(VigossProperties.class)
@EnableConfigurationProperties(VigossProperties.class)
public class VigossAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "vigossConnnector")
    public VigossConnnector vigossConnnector() {
        return new VigossConnnector();
    }
}
