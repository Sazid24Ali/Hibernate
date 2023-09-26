package com.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "hibernate_States")
public class States {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stateCode;
    private String stateName;

    @ManyToOne
    @JoinColumn(name="countryCode")
    Country country;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public States(String stateName) {
        this.stateName = stateName;
    }

    public States() {
        //Non Args constructor
    }

    public States(int stateCode, String stateName, Country country) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.country = country;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    
}
