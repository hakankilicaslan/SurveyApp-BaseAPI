package com.bilgeadam.BABaseApiPlaceholder;


import com.bilgeadam.BABaseApiPlaceholder.utility.TestAndRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class BaBaseApiPlaceholderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaBaseApiPlaceholderApplication.class, args);
	}

}
