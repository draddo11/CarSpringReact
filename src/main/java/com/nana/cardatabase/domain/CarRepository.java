package com.nana.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends
        CrudRepository<Car,Long> {
}
