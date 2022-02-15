package com.everton.ficticiouscleancode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
@EnableSpringDataWebSupport
@EnableSwagger2
public class FicticiousCleanCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FicticiousCleanCodeApplication.class, args);
	}

}
