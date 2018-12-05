package io.anymobi.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ManProperties.class)
public class ManConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Man man(ManProperties properties){
        Man man = new Man();
        man.setName(properties.getName());
        man.setAge(properties.getAge());

        return man;
    }

}
