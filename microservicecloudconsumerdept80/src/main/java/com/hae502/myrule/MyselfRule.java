package com.hae502.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {
    @Bean
    public IRule getMyselfRule() {
        return new MyAccumulateNumberRoundRobinRule();
    }
}
