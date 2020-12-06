package com.liucan.vigoss.spring.boot.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for vigoss.
 * @author liucan
 * @date 12/6/20 3:38 PM
 */
@Data
@ConfigurationProperties(prefix = "vigoss")
public class VigossProperties {
    /**
     * Url
     */
    private String url;
    /**
     * Host
     */
    private String host;
}
