package com.heba.distractmedicinekind.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class addmedicinekind {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicineId;
    private String medicineName;
    private String ScientificName;
    private String medicineDescribe;
    private int price;
    private int availableQuantity;
}
