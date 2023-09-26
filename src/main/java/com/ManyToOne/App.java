package com.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Setting Up the COnnection
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFactory = cfg.buildSessionFactory();

        // Generating Data And Storing The Data

        
        States state1 = new States();
        state1.setStateName("Andra Pradesh");
        States state2 = new States();
        state2.setStateName("Telangana");
        States state3= new States();
        state3.setStateName("Tamil Nadu");
        
        Country countryObject = new Country();
        countryObject.setCountryCode(91);
        countryObject.setCountryName("India");

        countryObject.getStates().add(state3);
        countryObject.getStates().add(state2);
        countryObject.getStates().add(state1);

        state1.setCountry(countryObject);
        state2.setCountry(countryObject);
        state3.setCountry(countryObject);
        
         // Opening a Session and Begining Transaction
        Session session = sFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Saving the data
        session.persist(countryObject);

        // Commiting the Data To Table ( Permenant Save )
        transaction.commit();
        session.close();
        sFactory.close();
    }
}
