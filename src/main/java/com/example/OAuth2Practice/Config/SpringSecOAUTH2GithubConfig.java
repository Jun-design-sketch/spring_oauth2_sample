package com.example.OAuth2Practice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecOAUTH2GithubConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
        return http.build();
    }

// Option 1
//    @Bean
//    public ClientRegistrationRepository clientRepository() {
//        ClientRegistration clientReg = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientReg);
//    }
//
//    private ClientRegistration clientRegistration(){
//        return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("")
//                .clientSecret("").build();
//    }

}
