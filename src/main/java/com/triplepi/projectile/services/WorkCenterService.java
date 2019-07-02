package com.triplepi.projectile.services;

import com.triplepi.projectile.models.domain.ScheduleItemWorkCenterDTO;
import com.triplepi.projectile.repositories.WorkCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkCenterService {

    private final WorkCenterRepository workCenterRepository;

    public WorkCenterService(WorkCenterRepository workCenterRepository) {
        this.workCenterRepository = workCenterRepository;
    }

    public void saveWorkCenters(List<ScheduleItemWorkCenterDTO> workCenterDTOS){
        workCenterRepository.saveAll(workCenterDTOS);
    }

    public List<ScheduleItemWorkCenterDTO> getWorkCenters(){
        return workCenterRepository.findAll();
    }

}
