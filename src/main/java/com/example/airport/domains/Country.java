package com.example.airport.domains;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "code")
    private  String code;
    @Column(name = "name")
    private String name;

    public Country( String code, String name) {
        this.code = code;
        this.name = name;
    }

    protected Country() {

    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
