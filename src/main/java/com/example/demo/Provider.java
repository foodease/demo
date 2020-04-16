package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name = "PROVIDER")
public class Provider {

    @Id
    @Column(name = "PROVIDER_ID")
    @GeneratedValue
    private long PROVIDER_ID;
    @Column(name = "RESTAURANT_NAME")
    private String RESTAURANT_NAME;
    @Column(name = "RESTAURANT_ID")
    private String RESTAURANT_ID;

    public Provider() {
        super();
    }

    public Provider(long PROVIDER_ID, String RESTAURANT_NAME, String RESTAURANT_ID) {
        this.PROVIDER_ID = PROVIDER_ID;
        this.RESTAURANT_NAME = RESTAURANT_NAME;
        this.RESTAURANT_ID = RESTAURANT_ID;
    }
}

