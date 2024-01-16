package com.nana.cardatabase.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstname, lastname;

    public Owner(){}

    public Owner(String firstname,String  lastname){
            super();
            this.firstname = firstname;
            this.lastname = lastname;
        }

    public long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @OneToMany(cascade = CascadeType.ALL , mappedBy="owner")
    private List<Car> cars;


    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}


