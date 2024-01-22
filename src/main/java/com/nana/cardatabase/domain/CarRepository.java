package com.nana.cardatabase.domain;

//import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//(path="vehicles")
@RepositoryRestResource
public interface CarRepository extends
        CrudRepository<Car,Long> {
    //fetch cars by brands
    List<Car> findByBrand (@Param("brand")String brand);

    //fetch cars by color
    List<Car> findByColor(@Param("color") String color);
}
