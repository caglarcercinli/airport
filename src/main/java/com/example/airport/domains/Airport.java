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
    @Column(name = "iso_country")
    private String iso_country;

    public Airport(long id, String ident, String iso_country) {
        this.id = id;
        this.ident = ident;
        this.iso_country = iso_country;
    }

    protected Airport() {

    }

    public long getId() {
        return id;
    }

    public String getIdent() {
        return ident;
    }

    public String getIso_country() {
        return iso_country;
    }
}
