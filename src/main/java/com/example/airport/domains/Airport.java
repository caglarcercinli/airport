package com.example.airport.domains;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

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
    @OneToMany(mappedBy = "airport")
    private List<Runaway> runaways;

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
    public List<Runaway> getRunways() {
        return Collections.unmodifiableList(runaways);
    }
}
