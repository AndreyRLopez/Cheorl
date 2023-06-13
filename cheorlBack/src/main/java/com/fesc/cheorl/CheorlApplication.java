package com.fesc.cheorl;

import javax.crypto.SecretKey;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fesc.cheorl.Utils.AppContexto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

// @SpringBootApplication
@SpringBootApplication()
@EnableJpaAuditing
public class CheorlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheorlApplication.class, args);
		System.out.println("Corriendo...");
		SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
		String base64Key = Encoders.BASE64.encode(key.getEncoded());
		System.out.println(base64Key);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	@Bean
	public AppContexto appContexto() {
		return new AppContexto();
	}
}
