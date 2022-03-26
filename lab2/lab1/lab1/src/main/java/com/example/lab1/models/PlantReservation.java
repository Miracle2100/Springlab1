package com.example.lab1.models;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class PlantReservation {
    @Id
    @GeneratedValue
    Long id;

    @Embedded
    BusinessPeriod schedule;
    @ManyToOne
    PurchaseOrder rental;
    @ManyToOne
    PlantInventoryItem plant;


    public void setPlant(PlantInventoryItem item) {
    }

    public void setSchedule(BusinessPeriod of) {
    }
}
