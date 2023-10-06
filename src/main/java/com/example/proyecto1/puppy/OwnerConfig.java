package com.example.proyecto1.puppy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Configuration
public class OwnerConfig {

    @Bean
    CommandLineRunner commandLineRunner(OwnerRepository repository){

        return args-> {

            Owner Sofia = new Owner(

                    "Sofia",
                    "Antioquia",
                    LocalDate.of(2004, Month.SEPTEMBER, 23),
                    "sofiaaristizabal23@gmail.com",
                    1025642483L
            );

            Owner Juanse = new Owner(

                    "Juanse",
                    "Huila",
                    LocalDate.of(2006, Month.JULY, 28),
                    "sofiaaristizabal23@gmail.com",
                    1025642483L
            );

            Owner Luis = new Owner(

                    "Luis",
                    "Bolivar",
                    LocalDate.of(2005, Month.OCTOBER, 21),
                    "sofiaaristizabal23@gmail.com",
                    1025642483L
            );

            repository.saveAll(
                    List.of(Sofia, Juanse, Luis)
            );
        };
    }
}