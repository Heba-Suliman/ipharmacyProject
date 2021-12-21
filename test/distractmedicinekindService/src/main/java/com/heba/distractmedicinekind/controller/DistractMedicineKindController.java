package com.heba.distractmedicinekind.controller;

import ch.qos.logback.core.net.server.Client;
import com.heba.distractmedicinekind.service.DistractMedicineKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;




    @RestController
    @RequestMapping("/distractmedicinekind")
    public class DistractMedicineKindController {
        @Autowired
        DistractMedicineKindService distractMedicineKindService;

        @GetMapping("/")
        public String getData() {
            return "Just return data ...";
        }

        @GetMapping("/allDistract")
        public List getAllDistract() {
            return distractMedicineKindService.getAllDistract();
        }


    @ManyToOne
    @JoinColumn(name = "medicineId", referencedColumnName = "Id")
    private Client client;

}
