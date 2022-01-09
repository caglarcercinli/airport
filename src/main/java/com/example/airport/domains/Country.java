package com.example.airport.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "code")
    private  String code;
    @Column(name = "name")
    private String name;
//    @ElementCollection
//    @CollectionTable(name = "airports",joinColumns = @JoinColumn(name = "iso_country"))
    @OneToMany(mappedBy = "country")
    private List<Airport> airports;


    public Country( String code, String name) {
        this.code = code;
        this.name = name;
//        this.airports = new LinkedHashSet<>();
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

    public List<Airport> getAirports() {
        return Collections.unmodifiableList(airports);
    }

}
