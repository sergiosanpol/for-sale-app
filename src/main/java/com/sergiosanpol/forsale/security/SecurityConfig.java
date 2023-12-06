package com.sergiosanpol.forsale.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity
				.authorizeHttpRequests(auth -> 
					auth.requestMatchers("/prueba/metodo").authenticated()
				)
				.addFilterBefore(new FiltroToken(), BasicAuthenticationFilter.class)
				//.csrf(csrf -> csrf.disable())
				.formLogin(AbstractHttpConfigurer::disable)
				.build();
	}
	

}
