package com.triplepi.projectile.rest;

import com.triplepi.projectile.models.domain.ScheduleItemWorkCenterDTO;
import com.triplepi.projectile.repositories.WorkCenterRepository;
import com.triplepi.projectile.services.WorkCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workCenters")
public class WorkCenterController {

    private final WorkCenterService workCenterService;

    public WorkCenterController(WorkCenterService workCenterService) {
        this.workCenterService = workCenterService;
    }

    @GetMapping
    public List<ScheduleItemWorkCenterDTO> getWorkCenters(){
        return workCenterService.getWorkCenters();
    }

    @PostMapping
    public void saveWorkCenters(List<ScheduleItemWorkCenterDTO> workCenterDTOS){
        workCenterService.saveWorkCenters(workCenterDTOS);
    }

}
