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
public class distractmedicinekind {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String date;
    private String time;
    private String patientName;
    private int separableQuantity;
    private int NumberOfPills;
    private int price;
    private int medicineId;

}
