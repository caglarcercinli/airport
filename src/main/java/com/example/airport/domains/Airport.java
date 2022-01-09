package com.example.airport.domains;

import javax.persistence.*;

@Entity
@Table(name = "airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ident")
    private String ident;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iso_country", referencedColumnName = "code", insertable = false, updatable = false)
    private Country country;

    public Airport(long id, String ident) {
        this.id = id;
        this.ident = ident;
    }

    protected Airport() {

    }

    public long getId() {
        return id;
    }

    public String getIdent() {
        return ident;
    }

    public Country getCountry() {
        return country;
    }
}
