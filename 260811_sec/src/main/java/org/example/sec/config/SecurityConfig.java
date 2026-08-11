package org.example.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig { // 이름은 상관 X
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) {
        // 필터 역할을 하여 dispatcher servlet에 앞서서 보안 처리
        // http -> 빌더
        http
                .formLogin(Customizer.withDefaults())
                .logout(Customizer.withDefaults());
        return http.build();
    }
}