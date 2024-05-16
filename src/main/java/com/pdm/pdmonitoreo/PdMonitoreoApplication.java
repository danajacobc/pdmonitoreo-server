package com.pdm.pdmonitoreo;

import com.pdm.pdmonitoreo.domain.repositories.PaisRepository;
import com.pdm.pdmonitoreo.domain.repositories.PlantasRepository;
import com.pdm.pdmonitoreo.domain.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PdMonitoreoApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
		SpringApplication.run(PdMonitoreoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        this.userRepository.findAll()
                .forEach(user -> System.out.println(user.getEmail() + "-" + this.bCryptPasswordEncoder.encode(user.getPassword())));
    }

}
