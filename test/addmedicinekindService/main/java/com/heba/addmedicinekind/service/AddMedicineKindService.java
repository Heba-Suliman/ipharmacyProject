package com.heba.addmedicinekind.service;

import com.heba.addmedicinekind.model.addmedicinekind;
import com.heba.addmedicinekind.repository.AddMedicineKindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddMedicineKindService {
    @Autowired
    AddMedicineKindRepository addMedicineKindRepository;

    public addmedicinekind saveAddMedicineKind(addmedicinekind addmedicineKind){
        return addMedicineKindRepository.save(addmedicineKind);
    }

    public List getAllMedicine(){
        return addMedicineKindRepository.findAll();
    }

}
