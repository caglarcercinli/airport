package com.example.airport.domains;

import javax.persistence.*;

@Entity
@Table(name = "runways")
public class Runaway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "airport_ref")
    private long airport_ref;
    @Column(name = "le_ident")
    private String le_ident;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airport_ref", referencedColumnName = "id", insertable = false, updatable = false)
    private Airport airport;

    public Runaway(long airport_ref, String le_ident) {
        this.airport_ref = airport_ref;
        this.le_ident = le_ident;
    }

    protected Runaway() {

    }

    public long getId() {
        return id;
    }

    public long getAirport_ref() {
        return airport_ref;
    }

    public String getLe_ident() {
        return le_ident;
    }

    public Airport getAirport() {
        return airport;
    }
}
