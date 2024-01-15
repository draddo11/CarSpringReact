package com.nana.cardatabase;

import com.nana.cardatabase.domain.CarRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
    private static final Logger logger=
            LoggerFactory.getLogger
                    (CardatabaseApplication.class);
    @Autowired
    private CarRepository repository;

    public static void main(String[] args) {
        SpringApplication.run
                (CardatabaseApplication.class, args);
        logger.info("App is going hard !!");
    }

    @Override
    public void run (String...args) throws Exception{

    }
}
