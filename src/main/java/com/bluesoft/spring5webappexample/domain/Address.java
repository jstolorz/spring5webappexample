package com.bluesoft.spring5webappexample.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String state;
    private String zip;

    public Address() {
    }

    public Address(final String city, final String state, final String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }


}
