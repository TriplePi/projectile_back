package com.triplepi.projectile.services;

import com.triplepi.projectile.models.domain.ScheduleItemDTO;
import com.triplepi.projectile.models.im.ScheduleItemActionIM;
import com.triplepi.projectile.repositories.ScheduleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleItemRepository scheduleItemRepository;

    @Autowired
    public ScheduleService(ScheduleItemRepository scheduleItemRepository) {
        this.scheduleItemRepository = scheduleItemRepository;
    }

    public void addScheduleItems(List<ScheduleItemDTO> scheduleItemDTOs){
        scheduleItemRepository.saveAll(scheduleItemDTOs);
    }

    public void saveAction(Long scheduleItemId, ScheduleItemActionIM scheduleItemActionIM) {
        ScheduleItemDTO scheduleItemDTO = scheduleItemRepository.getOne(scheduleItemId);
        //status
    }
}
