package com.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "hibernate_Country")
public class Country {
    @Id
    private int countryCode;
    private String countryName;

    @OneToMany(mappedBy = "country",cascade =CascadeType.ALL)
    private List<States> states = new ArrayList<States>();

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<States> getStates() {
        return states;
    }

    public void setStates(List<States> states) {
        this.states = states;
    }

    

    public Country() {
    }

    public Country(int countryCode, String countryName, List<States> states) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.states = states;
    }
    


}
