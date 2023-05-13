package ar.com.java.test.configuration;

import com.google.common.net.HttpHeaders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CoreConfiguration {
    @Value("${transaction.apiKey}")
    private String apiKey;

    @Bean
    public WebClient webClient(){
        return WebClient.builder().defaultHeader(HttpHeaders.AUTHORIZATION, apiKey).build();
    }
}