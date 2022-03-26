package com.example.lab1.models;

import javax.persistence.*;

public class PlantInventoryItem {
    @Id
    @GeneratedValue
    Long id;
    String serialNumber;

    @Enumerated(EnumType.STRING)
    EquipmentCondition equipmentCondition;
    @ManyToOne
    PlantInventoryEntry plantInfo;
}
