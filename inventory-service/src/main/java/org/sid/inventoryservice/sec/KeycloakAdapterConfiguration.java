package org.sid.inventoryservice.sec;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakAdapterConfiguration {

    @Bean
    public KeycloakSpringBootConfigResolver springBootConfigResolver(){
            return new KeycloakSpringBootConfigResolver();
    }
}
