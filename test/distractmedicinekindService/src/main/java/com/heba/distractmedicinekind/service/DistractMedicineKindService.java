package com.heba.distractmedicinekind.service;


import com.heba.distractmedicinekind.repository.DistractMedicineKindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistractMedicineKindService {
    @Autowired
    DistractMedicineKindRepository distractMedicineKindRepository;

    public List getAllDistract(){
        return distractMedicineKindRepository.findAll();

    }
}
