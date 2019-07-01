package com.triplepi.projectile.rest;

import com.triplepi.projectile.models.domain.ScheduleItemDTO;
import com.triplepi.projectile.models.im.ScheduleItemActionIM;
import com.triplepi.projectile.services.ScheduleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public void addScheduleItem(@RequestBody List<ScheduleItemDTO> scheduleItemDTOList){
        scheduleService.addScheduleItems(scheduleItemDTOList);
    }

    @PostMapping("{id}/action")
    public void saveAction(@PathVariable Long id, @RequestBody ScheduleItemActionIM scheduleItemActionIM){
        scheduleService.saveAction(id,scheduleItemActionIM);
    }

}
