package com.pdm.pdmonitoreo;

import com.pdm.pdmonitoreo.domain.repositories.PaisRepository;
import com.pdm.pdmonitoreo.domain.repositories.PlantasRepository;
import com.pdm.pdmonitoreo.domain.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PdMonitoreoApplication {

	private final UserRepository userRepository;
	private final PlantasRepository plantasRepository;
	private final PaisRepository paisRepository;

    public PdMonitoreoApplication(UserRepository userRepository, PlantasRepository plantasRepository, PaisRepository paisRepository) {
        this.userRepository = userRepository;
        this.plantasRepository = plantasRepository;
        this.paisRepository = paisRepository;
    }


    public static void main(String[] args) {
		SpringApplication.run(PdMonitoreoApplication.class, args);
	}

}
