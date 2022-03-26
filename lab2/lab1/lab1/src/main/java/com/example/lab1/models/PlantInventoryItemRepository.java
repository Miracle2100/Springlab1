package com.example.lab1.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantInventoryItemRepository extends JpaRepository<PlantInventoryItem, Long> {
    PlantInventoryItem findOneByPlantInfo(PlantInventoryEntry entry);
}
