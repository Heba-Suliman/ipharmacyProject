package com.heba.addmedicinekind.controller;

import ch.qos.logback.core.net.server.Client;
import com.heba.addmedicinekind.model.addmedicinekind;
import com.heba.addmedicinekind.service.AddMedicineKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;



@RestController
@RequestMapping("/telemedicine")
public class AddMedicineKindController {

    @Autowired
    AddMedicineKindService addMedicineKindService;

    @GetMapping("/")
    public String getData() {
        return "Just return data ...";
    }

    @PostMapping("/")
    public addmedicinekind saveAddmedicinekind(@RequestBody addmedicinekind addmedicineKind){
        return addMedicineKindService.saveAddMedicineKind(addmedicineKind);
    }
    @GetMapping("/all")
    public List getAllMedicine() {
        return addMedicineKindService.getAllMedicine();
    }




}
