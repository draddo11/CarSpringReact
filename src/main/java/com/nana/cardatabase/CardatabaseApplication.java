package com.nana.cardatabase;

import com.nana.cardatabase.domain.*;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
    private static final Logger logger=
            LoggerFactory.getLogger
                    (CardatabaseApplication.class);
    @Autowired
    private CarRepository repository;
    @Autowired
    private OwnerRepository orepository;
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run
                (CardatabaseApplication.class, args);
        logger.info("App is going hard !!");
    }


    @Override
    public void run (String...args) throws Exception{
        Owner owner1 = new Owner("Mark","Johnson");
        Owner owner2= new Owner("Nana","Appiah");
        Owner owner3= new Owner ("Adjei","Mensah");
        orepository.saveAll(Arrays.asList(owner1,owner2,owner3));
        repository.save(new Car("Ford" , "Mustang"
                ,"Red","ADF-1234" , 2024 ,56700, owner1));

        repository.save(new Car("Toyota" , "Rav4"
                ,"Ash","ADD-4554" , 2025 ,77700,owner2));

        repository.save(new Car("Mecedes Benz" , "S 550"
                ,"Black","ADF-5504" , 2026 ,80700,owner2));
        for (Car car: repository.findAll()) {
            logger.info(car.getBrand() + " " + car.getModel() + " " + car.getColor() + " " + car.getPrice());

            }
        userRepository.save(new User("user","$2a$12$n0EE4yUwqKwskjsPOpGfd.I//d9NuLyDoj8I.qvoyxYMwXjf43UyK"
                ,"USER"));

        }
    }

